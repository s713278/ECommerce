package com.kapps.cart.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.kapps.cart.repository.CartRepository;
import com.kapps.cart.service.CartService;
import com.kapps.cart.service.ItemPriceService;
import com.kapps.cart.vo.CartRequest;
import com.kapps.cart.vo.CartResponse;
import com.kapps.cart.vo.CommerceItemVO;
import com.kapps.cart.vo.ShoppingCartVO;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Autowired
	private ItemPriceService itemPriceService;

	@Override
	public CartResponse addItem(CartRequest request) {
		String productId = request.getProductId();
		String skuID = request.getSkuId();
		int quanity = request.getQuanity();
		CartResponse response = new CartResponse();
		if (StringUtils.isEmpty(productId)) {
			// TODO:Exception
		}
		if (StringUtils.isEmpty(skuID)) {
			// TODO:Exception
		}
		if (quanity == 0) {
			// TODO:Exception
		}

		if (request.getCartId() == null) {
			response.setSuccess(Boolean.TRUE);
			CommerceItemVO commerceItemVO = new CommerceItemVO();
			commerceItemVO.setSkuId(skuID);
			commerceItemVO.setProductId(productId);
			 int k =10;
			// TODO:Get the price from the data base
			Double itemUnitPrice = itemPriceService.getItemPrice(skuID).get(skuID);
			commerceItemVO.setUnitPrice(itemUnitPrice);
			commerceItemVO.setAmount(quanity * itemUnitPrice);
			commerceItemVO.setQuanity(quanity);
			ShoppingCartVO shoppingCartVO = new ShoppingCartVO();
			shoppingCartVO.getCommerceItems().add(commerceItemVO);
			response.setCartId(UUID.randomUUID().toString());
			response.setShoppingCartVO(shoppingCartVO);
		} else {
			response = getCart(request.getCartId());
			ShoppingCartVO shoppingCart =  response.getShoppingCartVO();
			List<CommerceItemVO> commerceItems = shoppingCart.getCommerceItems();
			for(CommerceItemVO commerceItem : commerceItems) {
				if(productId.equalsIgnoreCase(commerceItem.getProductId()) && skuID.equalsIgnoreCase(commerceItem.getSkuId())) {
					commerceItem.setQuanity(commerceItem.getQuanity() + quanity);
					commerceItem.setAmount(commerceItem.getQuanity() * commerceItem.getUnitPrice());
				}
			}
		}
		return cartRepository.save(response);
	}

	@Override
	public CartResponse removeItem(CartRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartResponse updateItem(CartRequest request) {
		return null;
	}

	@Override
	public CartResponse getCart(String cartId) {
		if(cartRepository.findById(cartId).isPresent()) {
			return cartRepository.findById(cartId).get();
		}
		return new CartResponse();
	}

	@Override
	public Iterable<CartResponse> findAll() {
		return cartRepository.findAll();
	}
	
	
}

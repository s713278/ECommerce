package com.kapps.cart.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kapps.cart.service.CartService;
import com.kapps.cart.vo.CartRequest;
import com.kapps.cart.vo.CartResponse;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartService cartService;
	
	@GetMapping(value="/get/{cartId}")
	@ResponseBody
	public CartResponse getCart(@PathVariable("cartId") String cartId) {
		LOGGER.debug("Received request to get cart with id : {0}",cartId);
		return cartService.getCart(cartId);
	}
	
	
	@GetMapping(value="/getAll")
	@ResponseBody
	public Iterable<CartResponse> getAll() {
		Iterable<CartResponse> it =null;
		try {
			LOGGER.debug("Received request to getAll");
			it = cartService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return it;
	}
	
	@PostMapping(value="/add")
	@ResponseBody
	public CartResponse addItemToOrder(@RequestBody CartRequest cartRequest) {
		LOGGER.info("Received request for adding item and request is : {0}",cartRequest);
		return cartService.addItem(cartRequest);
	}
	
	@PostMapping(value="/update")
	@ResponseBody
	public CartResponse updateItemToOrder(@RequestBody CartRequest cartRequest) {
		return null;
	}
	
	@PostMapping(value="/remove")
	@ResponseBody
	public CartResponse removeItemFromOrder(@RequestBody CartRequest cartRequest) {
		return null;
	}
	
	@ExceptionHandler(Exception.class)
    void handleExceptions(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal server error. We will be addressing this issue soon.");
    }
}

package com.zensar.util;

import com.zensar.cart.service.ItemPriceService;
import com.zensar.cart.service.impl.DBItemPriceServiceImpl;

public class ItemPriceFactory {

	public ItemPriceService getItemPrice(Enum<PaymentTypeEnum> paymentTypeEnum){
		
		ItemPriceService itemPriceService = new DBItemPriceServiceImpl();
		if(PaymentTypeEnum.External == paymentTypeEnum) {
			//TODO : Add new implementation objects
		}
		
		return itemPriceService;
	}
}

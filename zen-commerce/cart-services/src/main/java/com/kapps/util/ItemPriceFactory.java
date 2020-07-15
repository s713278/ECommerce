package com.kapps.util;

import com.kapps.cart.service.ItemPriceService;
import com.kapps.cart.service.impl.DBItemPriceServiceImpl;

public class ItemPriceFactory {

	public ItemPriceService getItemPrice(Enum<PaymentTypeEnum> paymentTypeEnum){
		
		ItemPriceService itemPriceService = new DBItemPriceServiceImpl();
		if(PaymentTypeEnum.External == paymentTypeEnum) {
			//TODO : Add new implementation objects
		}
		
		return itemPriceService;
	}
}

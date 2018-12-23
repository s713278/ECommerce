package com.zensar.util;
public enum PaymentTypeEnum{
		Default("default"),
		External ("External");
		
		String paymentType ;
		PaymentTypeEnum(String paymentType){
			this.paymentType = paymentType;
		}
	}
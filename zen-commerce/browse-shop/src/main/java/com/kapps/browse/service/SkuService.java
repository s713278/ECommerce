package com.kapps.browse.service;

import java.util.List;

import com.kapps.browse.entity.Sku;

public interface SkuService {

	List<Sku> getAllSkus();

	Sku getSku(String id);

	Sku save(Sku sku);

}

package com.zensar.browse.service;

import java.util.List;

import com.zensar.browse.dto.Sku;

public interface SkuService {

	List<Sku> getAllSkus();

	Sku getSku(long id);

	Sku save(Sku sku);

}

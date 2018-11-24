package com.zensar.browse.service;

import com.zensar.browse.dto.Sku;

public interface SkuService {

	Iterable<Sku> getAllSkus();

	Sku getSku(long id);

	Sku save(Sku sku);

}

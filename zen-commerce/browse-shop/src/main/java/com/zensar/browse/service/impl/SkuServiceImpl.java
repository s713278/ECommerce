package com.zensar.browse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.browse.dao.SkuDao;
import com.zensar.browse.dto.Sku;
import com.zensar.browse.service.SkuService;

public class SkuServiceImpl implements SkuService {

	@Autowired
	SkuDao skuRepository;
	
	@Override
	public Iterable<Sku> getAllSkus() {
		return skuRepository.findAll();
	}

	@Override
	public Sku getSku(long id) {
		return skuRepository.findById(id).get();
	}

	@Override
	public Sku save(Sku sku) {
		return skuRepository.save(sku);
	}

}

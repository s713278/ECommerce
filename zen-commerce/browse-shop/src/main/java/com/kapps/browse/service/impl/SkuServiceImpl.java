package com.kapps.browse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapps.browse.dao.SkuDao;
import com.kapps.browse.dto.Sku;
import com.kapps.browse.service.SkuService;

@Service
public class SkuServiceImpl implements SkuService {

	@Autowired
	SkuDao skuRepository;
	
	@Override
	public List<Sku> getAllSkus() {
		List<Sku> mutableList = new ArrayList<>();
		for (Sku p : skuRepository.findAll()) {
			mutableList.add(p);
		}
		return mutableList;
	}

	@Override
	public Sku getSku(String id) {
		return skuRepository.findById(id).get();
	}

	@Override
	public Sku save(Sku sku) {
		return skuRepository.save(sku);
	}

}

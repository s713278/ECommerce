package com.zensar.browse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.browse.dao.SkuDao;
import com.zensar.browse.dto.Sku;
import com.zensar.browse.service.SkuService;

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
	public Sku getSku(long id) {
		return skuRepository.findById(id).get();
	}

	@Override
	public Sku save(Sku sku) {
		return skuRepository.save(sku);
	}

}

package com.zensar.browse.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Sku;

public interface SkuDao extends CrudRepository<Sku, Long>  {
}
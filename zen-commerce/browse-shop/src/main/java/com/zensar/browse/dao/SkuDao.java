package com.zensar.browse.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Sku;

public interface SkuDao extends CrudRepository<Sku, String>  {
	List<Sku> findAll(Sort sort);
}
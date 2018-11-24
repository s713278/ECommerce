package com.zensar.browse.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Sku;

public interface SkuRepository extends CrudRepository<Sku, Long>  {
}
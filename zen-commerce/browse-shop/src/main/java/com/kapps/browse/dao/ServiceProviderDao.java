package com.kapps.browse.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kapps.browse.entity.ServiceProvider;

public interface ServiceProviderDao extends PagingAndSortingRepository<ServiceProvider, Long>  {

}
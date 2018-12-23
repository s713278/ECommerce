package com.zensar.checkout.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zensar.checkout.vo.OrderVO;

public interface OrderRepository extends PagingAndSortingRepository<OrderVO, String>{

}

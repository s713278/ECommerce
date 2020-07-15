package com.kapps.checkout.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kapps.checkout.vo.OrderVO;

public interface OrderRepository extends PagingAndSortingRepository<OrderVO, String>{

}

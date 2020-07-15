package com.kapps.checkout.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kapps.checkout.vo.OrderVO;

@Repository
public interface ShiipingRepository extends CrudRepository<OrderVO, Long> {

}

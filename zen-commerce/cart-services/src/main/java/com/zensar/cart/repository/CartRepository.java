package com.zensar.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.cart.vo.CartResponse;

@Repository
public interface CartRepository extends CrudRepository<CartResponse, String> {

}

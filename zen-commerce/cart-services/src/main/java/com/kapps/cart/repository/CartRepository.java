package com.kapps.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kapps.cart.vo.CartResponse;

@Repository
public interface CartRepository extends CrudRepository<CartResponse, String> {

}

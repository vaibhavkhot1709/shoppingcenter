package com.shoppingcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcenter.entity.Shop;

public interface ShopsRepo extends JpaRepository<Shop, Integer> {

}

package com.shoppingcenter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shoppingcenter.entity.Shop;

public interface ShopsRepo extends JpaRepository<Shop, Integer> {

	
//	@Query("")
//	public List<Shop> getAllShops();
	
	@Query("select s from Shop s WHERE s.shopName= :name")
	public List<Shop> getAllShopsByName(@Param("name") String shopName);
	
	@Query("select s from Shop s WHERE s.shopId= :id")
	public Shop getAllShopsByShopId(@Param("id") int shopId);
	
	@Query("SELECT s.shopName FROM Shop s")
	List<String> getAllShopNames();
}

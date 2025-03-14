package com.shoppingcenter.dao;

import java.util.List;

import com.shoppingcenter.entity.Shop;

public interface ShopDao {

	
	public Shop saveShop(Shop Shop);
	public Shop getShopById(int stdId);
	public List<Shop> getAllShop();
	public void deletShopById(int stdId);
	public void deleteAllShop();
	
	public Shop updateShopById(int shopId,Shop Shop);
	
	public List<Integer> getListOfAllIds();
	
	public List<Shop> saveListOfShop(List<Shop> list);
	
	
	public Shop getShopByName(String name);
	
}

package com.shoppingcenter.service;

import java.util.List;

import com.shoppingcenter.entity.Shop;

public interface ShopService {

	
	public Shop saveShop(Shop Shop);
	public List<Shop> saveListOfShops(List<Shop> listOfShops);
	public Shop getShopById(int stdId);
	public List<Shop> getAllShop();
	public void deletShopById(int stdId);
	public void deleteAllShop();
	
	public Shop updateShopById(int shopId,Shop Shop);
	
	public List<Integer> getListOfAllIds();
	
	public List<Shop> saveListOfShop(List<Shop> list);
	
}

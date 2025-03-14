package com.shoppingcenter.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcenter.dao.ShopDaoImpl;
import com.shoppingcenter.entity.Shop;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopDaoImpl ShopDaoImpl;
	
	@Override
	public Shop saveShop(Shop shop) {
		
		List<Shop>existingShops=getAllShop();
		ShopDaoImpl.getShopByName(shop.getShopName());
		Boolean flag = existingShops.stream().filter(s-> s.getShopName().equals(shop.getShopName())).findAny().isPresent();
		if(flag) {
			System.out.println("Object are stored into Db :: "+shop);
		}
		List<String> shopName=existingShops.stream().map(s-> s.getShopName()).collect(Collectors.toList());
		Shop savedData = ShopDaoImpl.saveShop(shop);
		return savedData;
	}

	@Override
	public Shop getShopById(int shopId) {
		
		return ShopDaoImpl.getShopById(shopId);
	}

	@Override
	public List<Shop> getAllShop() {
		
		return ShopDaoImpl.getAllShop();
	}

	@Override
	public void deletShopById(int shopId) {
		ShopDaoImpl.deletShopById(shopId);
		
	}

	@Override
	public void deleteAllShop() {
		ShopDaoImpl.deleteAllShop();
		
	}

	@Override
	public Shop updateShopById(int shopId, Shop Shop) {
		
		return ShopDaoImpl.updateShopById(shopId, Shop);
	}

	@Override
	public List<Integer> getListOfAllIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> saveListOfShop(List<Shop> list) {
		// TODO Auto-generated method stub
		return null;
	}

}

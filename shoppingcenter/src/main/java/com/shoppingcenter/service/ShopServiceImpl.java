package com.shoppingcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcenter.dao.ShopDaoImpl;
import com.shoppingcenter.entity.Shop;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopDaoImpl ShopDaoImpl;
	
	@Override
	public Shop saveShop(Shop Shop) {
				Shop savedData = ShopDaoImpl.saveShop(Shop);
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

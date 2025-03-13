package com.shoppingcenter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shoppingcenter.entity.Shop;
import com.shoppingcenter.repositories.ShopsRepo;

@Component
public class ShopDaoImpl implements ShopDao {

	@Autowired
	ShopsRepo ShopRepo;
	@Override
	public Shop saveShop(Shop Shop) {
		
		return ShopRepo.save(Shop);
	}

	@Override
	public Shop getShopById(int shopId) {
		
		return ShopRepo.getReferenceById(shopId);
	}

	@Override
	public List<Shop> getAllShop() {
		
		return ShopRepo.findAll();
	}

	@Override
	public void deletShopById(int shopId) {
		ShopRepo.deleteById(shopId);
		
	}

	@Override
	public void deleteAllShop() {
		ShopRepo.deleteAll();
		
	}

	@Override
	public Shop updateShopById(int shopId, Shop Shop) {
		
		return ShopRepo.save(Shop);
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

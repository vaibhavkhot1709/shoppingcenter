package com.shoppingcenter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shoppingcenter.entity.Shop;
import com.shoppingcenter.exception.ShopNotExistsException;
import com.shoppingcenter.repositories.ShopsRepo;

@Component
public class ShopDaoImpl implements ShopDao {

	@Autowired
	ShopsRepo shopRepo;
	@Override
	public Shop saveShop(Shop Shop) {
		
		return shopRepo.save(Shop);
	}

	@Override
	public List<Shop> saveListOfShops(List<Shop> listOfShops){
		
		System.out.println("inside dao");
		return shopRepo.saveAll(listOfShops);
	}
	@Override
	public Shop getShopById(int shopId) {
//		return shopRepo.getReferenceById(shopId);
		return shopRepo.findById(shopId).orElseThrow(() -> new ShopNotExistsException("Shop not exists with ID: " + shopId));
	}

	@Override
	public List<Shop> getAllShop() {
		return shopRepo.findAll();
	}

	@Override
	public void deletShopById(int shopId) {
		shopRepo.deleteById(shopId);
		
	}

	@Override
	public void deleteAllShop() {
		shopRepo.deleteAll();
		
	}

	@Override
	public Shop updateShopById(int shopId, Shop Shop) {
		
//		shopRepo.s
		return shopRepo.save(Shop);
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
	
	@Override
	public Shop getShopByName(String name) {
		
		return null;
	}

	@Override
	public void deletShopByName(String shopName) {
		
	}
}

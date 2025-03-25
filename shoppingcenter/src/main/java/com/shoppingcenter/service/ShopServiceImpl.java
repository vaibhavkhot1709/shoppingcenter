package com.shoppingcenter.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcenter.dao.ShopDaoImpl;
import com.shoppingcenter.entity.Shop;
import com.shoppingcenter.exception.NoDataInDatabase;
import com.shoppingcenter.exception.ShopExistsException;
import com.shoppingcenter.exception.ShopNotExistsException;
import com.shoppingcenter.repositories.ShopsRepo;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopDaoImpl shopDaoImpl;
	private final ShopsRepo shopsRepo;
	
	public ShopServiceImpl(ShopsRepo shopsRepo) {
        this.shopsRepo = shopsRepo;
    }
	
	@Override
	public Shop saveShop(Shop shop) {
		
		List<Shop>  existingShopsByName= shopsRepo.getAllShopsByName(shop.getShopName());

		if(!existingShopsByName.isEmpty()) {
			throw new ShopExistsException("Shop already exist with name :"+ shop.getShopName());
		}
		return shopDaoImpl.saveShop(shop);
	}
	
	
	public List<Shop> saveListOfShops(List<Shop> listOfShops) {
		
		System.out.println("inside service");
		
		List<String>  existingShopsName= shopsRepo.getAllShopNames();
		
		System.out.println(" existingShopsName >>   "+existingShopsName);
		 List<String> newShopNames = listOfShops.stream()
                 .map(Shop::getShopName)
                 .collect(Collectors.toList());
		 
		 List<String> duplicateShopNames = newShopNames.stream()
                 .filter(existingShopsName::contains)
                 .collect(Collectors.toList());
	

		if (!duplicateShopNames.isEmpty()) {
			throw new ShopExistsException("This Shops  already exist with name :"+ duplicateShopNames.toString());
		}
		return shopDaoImpl.saveListOfShops(listOfShops);
	}

	@Override
	public Shop getShopById(int shopId) {	
		Shop sh=shopDaoImpl.getShopById(shopId);
		if(sh==null) {
			System.out.println("inside IF >>");
			throw new ShopNotExistsException("Shop is not exists with id: "+shopId);
		}
		return sh;
	}

	@Override
	public List<Shop> getAllShop() {
		List<Shop> sh=shopDaoImpl.getAllShop();
		if(sh==null) {
			throw new NoDataInDatabase("No data in Database");
		}
		return shopDaoImpl.getAllShop();
	}

	@Override
	public void deletShopById(int shopId) {
		
		if(shopDaoImpl.getShopById(shopId)==null) {
			throw new ShopNotExistsException("Shop is not exists with id: "+shopId);
		}
		
		shopDaoImpl.deletShopById(shopId);		
	}

	@Override
	public void deleteAllShop() {
		List<Shop> sh=shopDaoImpl.getAllShop();
		if(sh==null) {
			throw new NoDataInDatabase("No data in Database");
		}
		shopDaoImpl.deleteAllShop();
	}

	@Override
	public Shop updateShopById(int shopId, Shop shop) {
		
		if(shopDaoImpl.getShopById(shopId)==null) {
			throw new ShopNotExistsException("Shop is not exists with id: "+shopId);
		}else {
			shop.setShopId(shopId);
		}
		
		return shopDaoImpl.updateShopById(shopId, shop);
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

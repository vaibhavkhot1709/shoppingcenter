package com.shoppingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcenter.entity.Shop;
import com.shoppingcenter.service.ShopServiceImpl;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/shoppingcenter")
public class ShopController {

	
	@Autowired
	ShopServiceImpl shopServiceImpl; 
	
	@PostMapping("/shop")
	public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){
	
		return new ResponseEntity<>(shopServiceImpl.saveShop(shop), HttpStatus.CREATED);
	}
	
	@PostMapping("/allshops")
	public ResponseEntity<List<Shop>> saveListShop(@RequestBody List<Shop> listOfShops){
	
		System.out.println("inside controller");
		return new ResponseEntity<>(shopServiceImpl.saveListOfShops(listOfShops), HttpStatus.CREATED);
	}
	
	@GetMapping("/allShops")
	public ResponseEntity<List<Shop>> getAllStudents(){

		return ResponseEntity.ok(shopServiceImpl.getAllShop());
	}
	
	 @Transactional
	@GetMapping("/shop/{shop_id}")
	public ResponseEntity<Shop> getShopById(@PathVariable("shop_id") int shopId){
			return new ResponseEntity<>(shopServiceImpl.getShopById(shopId), HttpStatus.FOUND);		
	}

	@DeleteMapping("/shop/{shop_id}")
	public ResponseEntity<?> deleteShopById(@PathVariable("shop_id") int shopId){
		shopServiceImpl.deletShopById(shopId);
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		
		
	}
	
	@DeleteMapping("/shop/allshops")
	public ResponseEntity<?> deleteAllShops(){
		shopServiceImpl.deleteAllShop();
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}
	
	
	
	@PutMapping("/shop/{shop_id}")
	public ResponseEntity<Shop> updateShopById(@PathVariable("shop_id") int shopId, @RequestBody Shop shop){
			
		return ResponseEntity.ok(shopServiceImpl.updateShopById(shopId, shop));
	}
}

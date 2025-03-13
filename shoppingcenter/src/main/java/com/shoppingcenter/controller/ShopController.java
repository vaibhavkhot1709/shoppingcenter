package com.shoppingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcenter.entity.Shop;
import com.shoppingcenter.service.ShopServiceImpl;

@RestController
@RequestMapping("/shoppingcenter")
public class ShopController {

	
	@Autowired
	ShopServiceImpl shopServiceImpl; 
	
	@PostMapping("/shop")
	public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){
	
		return new ResponseEntity<>(shopServiceImpl.saveShop(shop), HttpStatus.CREATED);
	}
	
	@GetMapping("/allShops")
	public ResponseEntity<List<Shop>> getAllStudents(){

		return ResponseEntity.ok(shopServiceImpl.getAllShop());
	}
	
	@GetMapping("/shop/{shopId}")
	public ResponseEntity<Shop> getShopById(@PathVariable("shopId") int shopId){
		return ResponseEntity.ok(shopServiceImpl.getShopById(shopId));
	}

}

package com.shoppingcenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="Products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ProductId;
	String productName;
	
	String productBrandName;
	 
	Float productPrice;
	
	int productWorrenty;
	

}

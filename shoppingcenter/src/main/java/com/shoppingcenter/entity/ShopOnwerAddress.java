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



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="ShopOwnerAddress")
public class ShopOnwerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopOwnerAddId;


	private int shopOwnerFloorNo;
	
	private int shopOwnerFlatNo;
    
	private String shopOwnerBuildingName;
	
	private String ownerCityName;
    
	private int ownerPinNum;
}

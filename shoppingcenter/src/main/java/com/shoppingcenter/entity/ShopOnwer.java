package com.shoppingcenter.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="ShopOnwer")
public class ShopOnwer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int shopOwnerId;
	
	private String shopOnwerFirstName;
	 
	private String shopOnwerLastName;
	 
	private String shopOnwerEmail;

	private int shopOnwerContct;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "shopOwner_Add_Id", referencedColumnName = "shopOwnerAddId")
	ShopOnwerAddress shopOnwerAddress;
}

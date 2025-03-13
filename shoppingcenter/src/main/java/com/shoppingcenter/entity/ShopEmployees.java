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
@Setter
@Getter
@ToString
@Entity
@Table(name="ShopEmployees")
public class ShopEmployees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopEmpId;

	private String shopEmpFirstName;
	 
	private String shopEmpLastName;
	 
	private String shopEmpEmail;

	private int shopEmpContct;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "shopEmp_Add_Id", referencedColumnName = "empAddId")
	private EmployeeAddress employeeAddress;
}

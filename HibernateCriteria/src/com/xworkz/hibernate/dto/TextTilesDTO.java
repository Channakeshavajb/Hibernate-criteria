package com.xworkz.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Texttiles_details")
public class TextTilesDTO implements Serializable{
	@Id
	@GenericGenerator(name="criteria",strategy="increment")
	@GeneratedValue(generator="criteria")
	@Column(name="c_id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Brand_name")
	private String brand;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private int price;
	@Column(name="Payment_Type")
	private boolean payThroughCard;
	
	public TextTilesDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("created........\t"+this.getClass().getSimpleName());
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isPayThroughCard() {
		return payThroughCard;
	}

	public void setPayThroughCard(boolean payThroughCard) {
		this.payThroughCard = payThroughCard;
	}

	@Override
	public String toString() {
		return "TextTilesDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity + ", price="
				+ price + ", payThroughCard=" + payThroughCard + "]";
	}
	
	
	

}

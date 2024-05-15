package com.luminar.getmed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class GetMedMedicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "med_id")
	private Long med_id;
	 @Column(name = "med_name")
	private String med_name;
	 @Column(name = "med_description")
	private String med_description;
	 @Column(name = "med_usage")
	private String med_usage;
	 @Column(name = "med_price")
	private double med_price;
	 @Column(name = "image_Url")
	private String image_Url;

	public GetMedMedicine() {
	}

	public GetMedMedicine(String name, String description, String usage, double price, String imageUrl) {
		this.med_name = name;
		this.med_description = description;
		this.med_usage = usage;
		this.med_price = price;
		this.image_Url = imageUrl;
	}

	public Long getId() {
		return med_id;
	}

	public void setId(Long id) {
		this.med_id = id;
	}

	public String getName() {
		return med_name;
	}

	public void setName(String name) {
		this.med_name = name;
	}

	public String getDescription() {
		return med_description;
	}

	public void setDescription(String description) {
		this.med_description = description;
	}

	public String getUsage() {
		return med_usage;
	}

	public void setUsage(String usage) {
		this.med_usage = usage;
	}

	public double getPrice() {
		return med_price;
	}

	public void setPrice(double price) {
		this.med_price = price;
	}

	public String getImageUrl() {
		return image_Url;
	}

	public void setImageUrl(String imageUrl) {
		this.image_Url = imageUrl;
	}

}

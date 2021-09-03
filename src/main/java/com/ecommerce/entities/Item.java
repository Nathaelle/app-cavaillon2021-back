package com.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String reference;
	private String name;
	private String description;
	private String image;
	private float price;
	
	private String ingredients;
	
	//private ArrayList<String> allergens;
	
	private int quantity;

	@ManyToOne(targetEntity=Category.class)
	private Category category;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

//	public ArrayList<String> getAllergens() {
//		return allergens;
//	}
//
//	public void setAllergens(ArrayList<String> allergens) {
//		this.allergens = allergens;
//	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", reference=" + reference + ", name=" + name + ", description=" + description
				+ ", image=" + image + ", price=" + price + ", ingredients=" + ingredients + ", quantity=" + quantity
				+ ", category="  + "]";
	}
}

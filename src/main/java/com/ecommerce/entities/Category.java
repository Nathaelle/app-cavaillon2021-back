package com.ecommerce.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Category {
	
	@Id // Indique que cette propriété est l'identifiant de l'entité
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	private String shortText;
	
	// Une entité Category est en relation avec plusieurs entités Item
//	@OneToMany
//	@JoinColumn(name="category_id", referencedColumnName="id")
//	private List<Item> items = new ArrayList<Item>();
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

//	public List<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", shortText=" + shortText + ", items="  + "]";
	}

}
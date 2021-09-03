package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entities.Category;
import com.ecommerce.entities.Item;
import com.ecommerce.repositories.CategoryRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {
	
	@Autowired
	private CategoryRepository catRepo;

	@GetMapping("/categories")
	public List<Category> getAll() {
		
		List<Category> cats = this.catRepo.findAll();
		for(Category cat: cats) {
			for(Item it: cat.getItems()) {
				it.setCategory(null);
			}
		}
		
		return cats;
	}
	
	@GetMapping("/categories-{id}")
	public Category showCategory(@PathVariable int id) {
		
		Category category = (catRepo.existsById(id))? catRepo.getById(id) : new Category();
		for(Item it: category.getItems()) {
			it.setCategory(null);
		}
		
		return category;
		
	}
	
	@PostMapping("/add-category")
	public void addCategory() {
		
	}
}

package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entities.Category;
import com.ecommerce.repositories.CategoryRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {
	
	@Autowired
	private CategoryRepository catRepo;

	@GetMapping("/categories")
	public List<Category> getAll() {
		
		List<Category> cats = this.catRepo.findAll();
		return cats;
	}
}

package net.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.entity.Product;
import net.javaguides.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
		
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
		
	}
	
	
	
	@PostMapping("/findProducts")
	public List<Product> findAllProducts() {
		return service.getProducts();
		
	}
	
	@PostMapping("/findProducts")
	public List<Product> findProductById(@RequestBody List<Product> products) {
		return service.saveProducts(products);
		
	}
	
	

}

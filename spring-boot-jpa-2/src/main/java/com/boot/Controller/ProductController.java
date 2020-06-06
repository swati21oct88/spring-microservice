package com.boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Product;
import com.boot.model.ProductType;
import com.boot.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productService.getCreatedProduct(product));
	}

}

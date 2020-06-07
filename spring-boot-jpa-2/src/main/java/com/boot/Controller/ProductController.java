package com.boot.Controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.boot.model.Product;
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
	
	@GetMapping("/products/{productID}")
	public ResponseEntity<Product> getProductById(@PathVariable("productID") int prodId){
		return ResponseEntity.ok(productService.getProductById(prodId));
	}
	
	//@DeleteMapping("/products/{productID}") --works fine with postman
	@RequestMapping(value = "/delproducts/{productID}", method = RequestMethod.DELETE)//works fine when running from browser
	public ResponseEntity<String> removeProduct(@PathVariable("productID") int prodId){
		productService.removeProduct(prodId);
		return ResponseEntity.ok("Product removed Successfully for id  " + prodId);
	}
	
	@PutMapping("/products")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		productService.updateProduct(product);
		return ResponseEntity.ok("Product updated Successfully for id  " + product.getProductId());
	}

}

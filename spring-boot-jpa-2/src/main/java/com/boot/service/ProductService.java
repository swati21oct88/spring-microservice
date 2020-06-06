package com.boot.service;

import java.util.List;
import com.boot.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getCreatedProduct(Product product);
}

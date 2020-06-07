package com.boot.service;

import java.util.List;
import com.boot.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getCreatedProduct(Product product);
	public Product getProductById(int prodId);
	public void removeProduct(int prodId);
	public void updateProduct(Product product);
}

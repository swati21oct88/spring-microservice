package com.boot.dao;

import java.util.List;
import com.boot.model.Product;

public interface ProductDAO {
	public List<Product> getAllProducts();
	public void createProduct(Product product);
	public Product getCreatedProduct(Product product);
	public Product getProductById(int prodId);
	public void removeProduct(int prodId);
	public void updateProduct(Product product);
}

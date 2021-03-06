package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ProductDAO;
import com.boot.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO;
	
	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}

	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@Override
	public Product getCreatedProduct(Product product) {
		return productDAO.getCreatedProduct(product);
	}

	@Override
	public Product getProductById(int prodId) {
		return productDAO.getProductById(prodId);
	}

	@Override
	public void removeProduct(int prodId) {
		productDAO.removeProduct(prodId);
	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
	}	
}

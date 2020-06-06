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
}

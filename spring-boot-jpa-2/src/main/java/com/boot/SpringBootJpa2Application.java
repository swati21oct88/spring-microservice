package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.dao.ProductDAO;
import com.boot.model.Product;
import com.boot.model.ProductType;

@SpringBootApplication
public class SpringBootJpa2Application implements CommandLineRunner{

	private ProductDAO dao;
	
	@Autowired
	public SpringBootJpa2Application(ProductDAO dao) {
		super();
		this.dao = dao;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product(ProductType.BOOKS, 80);
		Product product2 = new Product(ProductType.COSMETICS, 50);
		Product product3 = new Product(ProductType.ELECTRONICS, 150);
		dao.createProduct(product1);
		dao.createProduct(product2);
		dao.createProduct(product3);
	}

}

package com.boot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.boot.model.Product;

@Repository("productDAO")
@EnableAutoConfiguration
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {

	private EntityManager entityManager;
	
	@Autowired
	public ProductDAOImpl(EntityManager manager) {
		super();
		this.entityManager = manager;
	}
	
	@Override
	@Transactional
	public List<Product> getAllProducts() {
		Session session = entityManager.unwrap(Session.class);
		TypedQuery<Product> query = session.createQuery("From Product",Product.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void createProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(product);
	}

	@Override
	@Transactional
	public Product getCreatedProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(product);
		return product;
	}
}

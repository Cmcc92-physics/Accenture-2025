package io.altar.jseprojectp2.services;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.ProductRepository;

public class ProductService extends EntityService<ProductRepository, Product> {

	public ProductService() {
		repository = ProductRepository.getInstance();

	}

}

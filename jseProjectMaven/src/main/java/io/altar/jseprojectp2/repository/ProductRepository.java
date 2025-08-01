package io.altar.jseprojectp2.repository;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.interfaces.ProductRepositoryCRUD_Interface;

public class ProductRepository extends EntityRepository<Product> implements ProductRepositoryCRUD_Interface {

	private static final ProductRepository INSTANCE = new ProductRepository();

	public static ProductRepository getInstance() {
		return INSTANCE;
	}

}

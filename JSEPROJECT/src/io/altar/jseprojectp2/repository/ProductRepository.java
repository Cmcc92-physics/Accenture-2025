package io.altar.jseprojectp2.repository;

import java.util.List;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.interfaces.ProductRepositoryCRUD_Interface;

public class ProductRepository extends EntityRepository<Product> implements ProductRepositoryCRUD_Interface{

	private static final ProductRepository INSTANCE = new ProductRepository();
		
	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	private ProductRepository() {
	}
	
	public String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> getShelfIdsByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(Product e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


}

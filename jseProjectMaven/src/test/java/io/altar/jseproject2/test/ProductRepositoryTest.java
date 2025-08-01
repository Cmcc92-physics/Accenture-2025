package io.altar.jseproject2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.ProductRepository;

public class ProductRepositoryTest {

	@Test
 void addToRepository() {
	 Product p = new Product();
	 ProductRepository pr = ProductRepository.getInstance();
	 assertEquals(0,pr.size());
	 pr.addEntity(p);
	 assertEquals(1,pr.size());
 }
	
	
}

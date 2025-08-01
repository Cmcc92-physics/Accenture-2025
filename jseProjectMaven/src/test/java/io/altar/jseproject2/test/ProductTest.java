package io.altar.jseproject2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import io.altar.jseprojectp2.model.Product;

public class ProductTest {

	@Test
	void ProductAtributes() {
	Product p = new Product();
	p.setIva(23);
	assertEquals(23, p.getIva());
	assertThrows(RuntimeException.class, () -> p.setIva(33));
	}
			
}

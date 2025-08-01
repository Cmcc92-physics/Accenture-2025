package io.altar.jseproject2.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.altar.jseprojectp2.model.Product;

public class ProductIdTest {

	
	@Test
	@DisplayName("Test set product id")
	void testSetProductId() {
		Product p = new Product();
		assertEquals(0, p.getEntityId(), "Default ID should be -1");
		assertDoesNotThrow(() -> {
			p.setEntityId(1);
		});
	}

	}

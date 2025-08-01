package io.altar.jseprojectp2.test;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import io.altar.jseprojectp2.model.Product;



public class TextInterfaceTest {
	
// In Java, assertEquals is a method commonly used in unit testing frameworks like JUnit to verify that two 
// values are equal. If the values are not equal, the test fails, and an AssertionError is thrown.
// Assertions.assertEquals(expected, actual, message);

// In JUnit 5, the assertDoesNotThrow method is used to verify that a block of code does not throw any 
// exceptions during its execution. If no exception is thrown, the test passes. If an exception is thrown,
// the test fails.

	
	@Test
	@DisplayName("Test set product id")
	void testSetProductId() {
		Product p = new Product();
		assertEquals(-1, p.getId(), "Default ID should be -1");
		assertDoesNotThrow(() -> {
			p.setEntityId(1);
		});
	}

	@Test
	@DisplayName("Test set product id with invalid id")
	void testSetProductIdWithInvalidId() {
		Product p = new Product();
		assertThrows(RuntimeException.class, () -> {
			p.setEntityId(-2);
		});
	}

	@Test
	void testSetProductIdAfterValidId() {
		Product p = new Product();
		p.setEntityId(1);
		assertThrows(RuntimeException.class, () -> {
			p.setEntityId(2);
		});
		assertThrows(RuntimeException.class, () -> {
			p.setEntityId(-2);
		});
	
	
	
	
	}
 }

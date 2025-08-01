package io.altar.jseprojectp2.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import io.altar.jseprojectp2.model.Product;

public class TextInterfaceApp repositoryP=ProductRepository.getInstance();
private void testGettAllProducts() {
		// "Product [productName=" + productName + ", shelfIds=" + shelfIds + ",
		// unitDiscount=" + unitDiscount + ", iva=" + iva + ", publicPrice=" +
		// publicPrice + "]";
		Product p1 = new Product("Product A", null, 5, 23, 20);
		Product p2 = new Product("Product B", null, 50, 23, 5);

		repositoryP.addEntity(p1);
		repositoryP.addEntity(p2);
		Collection<Product> all = repositoryP.getAll();
		assertEquals(2, all.size());
		assertTrue(p1.getId() == 1);

}

// In Java, assertEquals is a method commonly used in unit testing frameworks like JUnit to verify that two 
// values are equal. If the values are not equal, the test fails, and an AssertionError is thrown.
// Assertions.assertEquals(expected, actual, message);

// In JUnit 5, the assertDoesNotThrow method is used to verify that a block of code does not throw any 
// exceptions during its execution. If no exception is thrown, the test passes. If an exception is thrown,
// the test fails.
// <T> T assertDoesNotThrow(ThrowingSupplier<T> supplier)

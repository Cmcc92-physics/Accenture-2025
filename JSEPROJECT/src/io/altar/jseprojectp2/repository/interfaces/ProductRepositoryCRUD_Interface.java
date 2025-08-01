package io.altar.jseprojectp2.repository.interfaces;

import java.util.List;

import io.altar.jseprojectp2.model.Product;

public interface ProductRepositoryCRUD_Interface extends EntityRepositoryCRUD_Interface<Product> {

	List<Integer> getShelfIdsByProductId(int productId);
}

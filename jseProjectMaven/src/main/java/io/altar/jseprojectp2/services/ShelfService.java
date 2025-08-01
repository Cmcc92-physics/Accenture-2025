package io.altar.jseprojectp2.services;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.repository.ShelfRepository;

public class ShelfService extends EntityService<ShelfRepository, Shelf> {

	public ShelfService() {
		repository = ShelfRepository.getInstance();

		
	}

}

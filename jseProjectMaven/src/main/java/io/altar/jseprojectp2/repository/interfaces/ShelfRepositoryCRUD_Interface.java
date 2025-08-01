package io.altar.jseprojectp2.repository.interfaces;

import io.altar.jseprojectp2.model.Shelf;

public interface ShelfRepositoryCRUD_Interface extends EntityRepositoryCRUD_Interface<Shelf>{

	Shelf getEntity(int id);

}

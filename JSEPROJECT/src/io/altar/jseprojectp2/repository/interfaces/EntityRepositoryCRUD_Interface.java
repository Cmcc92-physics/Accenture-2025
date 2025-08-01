package io.altar.jseprojectp2.repository.interfaces;

import io.altar.jseprojectp2.model.Entity_;
import io.altar.jseprojectp2.utils.interfaces.CRUD_interface;

public abstract interface EntityRepositoryCRUD_Interface<T extends Entity_> extends CRUD_interface<T> {

	boolean isEmpty(); // Este método só é relevante para os meus repositorios CRUD
	
}

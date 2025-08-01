package io.altar.jseprojectp2.utils.interfaces;

import io.altar.jseprojectp2.model.Entity_;

public abstract interface CRUD_interface<T extends Entity_> {

	int create(T e);
	
	T read(int id);
	
	 void update(T e);
	 
	 void delete(int id);
	
}

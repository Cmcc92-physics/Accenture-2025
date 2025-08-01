package io.altar.jseprojectp2.utils.interfaces;

import java.util.Collection;
import java.util.Set;

import io.altar.jseprojectp2.model.Entity_;

public abstract interface CRUD_interface<T extends Entity_> {

	int addEntity(T e);
	
	T getEntity(int id);
	
	 void editEntity(T e);
	 
	 void removeEntity(int id);

	 Collection<T> getAll();
	 
	 Set<Integer> getAllIds();
	
}

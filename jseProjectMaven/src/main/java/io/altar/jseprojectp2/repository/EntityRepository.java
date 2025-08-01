package io.altar.jseprojectp2.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import io.altar.jseprojectp2.model.Entity_;

public abstract class EntityRepository<T extends Entity_> {

	
	
	private Map<Integer, T> db = new HashMap<Integer, T>(); // Inicia um HashMap vazio

	private int currentId = 0;

	// Criar (db.put)
	public int addEntity(T e) {
		e.setEntityId(currentId);
		db.put(currentId, e);
		return currentId++;
	}

	// Consult
	public Collection<T> getAll() {
		return db.values();
	}

	public Set<Integer> getAllIds() {
		return db.keySet();
	}
	
	public T getEntity(int id) {
		return db.get(id);
	}

	// Edit (db.put)
	public void editEntity(T e) {
		db.put(e.getEntityId(), e);
		System.out.println("Entidade atualizada com sucesso!");
	}

	// Remove an item (db.remove)
	public void removeEntity(int id) {
		db.remove(id);
		System.out.println("Entidade removida com sucesso!");
	}

	// Condition to verify if the Id is empty
	public boolean isEmpty() {
		return (db.size() == 0) ? true : false;
	}
	
	public int size() {
		return db.size();
	}
	
}

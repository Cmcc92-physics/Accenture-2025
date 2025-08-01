package io.altar.jseprojectp2.services;

import java.util.Collection;
import java.util.Set;

import io.altar.jseprojectp2.model.Entity_;
import io.altar.jseprojectp2.repository.EntityRepository;

public abstract class EntityService<R extends EntityRepository<T>, T extends Entity_> {

	protected R repository;
	
	public int addEntity(T entity) {
		return repository.addEntity(entity);
	}

	// Consult
	public Collection<T> getAll() {
		return repository.getAll();
	}

	public Set<Integer> getAllIds() {
		return repository.getAllIds();
	}

	public T getEntity(int id) {
		return repository.getEntity(id);
	}

	// Edit (db.put)
	public void editEntity(T entity) {
		repository.editEntity(entity);
	}

	// Remove an item (db.remove)
	public void removeEntity(int id) {
		repository.removeEntity(id);
	}

	// Condition to verify if the Id is empty
	public boolean isEmpty() {
		return repository.isEmpty();
	}

	public int size() {
		return repository.size();
	}
	
}

package io.altar.jseprojectp2.repository;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.repository.interfaces.ShelfRepositoryCRUD_Interface;

	public class ShelfRepository extends EntityRepository<Shelf> implements ShelfRepositoryCRUD_Interface {
		
		private static final ShelfRepository INSTANCE = new ShelfRepository(); // Final nunca pode alterar o seu valor de referência

		public static ShelfRepository getInstance() { 
			
			return INSTANCE; // INSTANCE é uma variável 
		}

		private ShelfRepository() {
		}

		public void addEntity(Shelf shelf) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int create(Shelf e) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Shelf read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(Shelf e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

	 	
	}


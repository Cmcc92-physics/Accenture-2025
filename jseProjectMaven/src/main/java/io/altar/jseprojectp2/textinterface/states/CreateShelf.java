package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

;

public class CreateShelf extends State {
	private ShelfService SS = new ShelfService();

	@Override
	public int on() {
		int capacity = scanner.getInt("Insira a capacidade da nova prateleira:");
		
		double dailyPrice = scanner.getDouble("Insira o preço diário de aluguer da prateleira:");
		
		Shelf newshelf = new Shelf(capacity, dailyPrice);
		SS.addEntity(newshelf);
		System.out.println("Prateleira adicionada com sucesso!");
		return 1;
	}

	
}

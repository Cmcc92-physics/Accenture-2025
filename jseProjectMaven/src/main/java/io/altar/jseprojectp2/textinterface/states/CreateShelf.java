package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

;

public class CreateShelf extends State {
	private ShelfService SS = new ShelfService();

	@Override
	public int on() {
		
		int capacity;
		double dailyPrice;
		while (true) {
			capacity = scanner.getInt("Insira a capacidade da nova prateleira:");
			if (capacity > 0) {
				System.out.println("Capacidade da nova prateleira válida!");
				break;
			} else {
				System.out.println("Capacidade da prateleira inválida. Apenas são permitidos números.");
			}
		}
	
			
			
	while (true) {
		dailyPrice = scanner.getDouble("Insira o preço diário de aluguer da prateleira:");
		if (dailyPrice >= 0) {
			System.out.println("Preço diário válido!");
			break;
		} else {
			System.out.println("Preço diário inválido. Apenas são permitidos números.");
		}
	}	
		
		
	
		
		Shelf newshelf = new Shelf(capacity, dailyPrice);
		SS.addEntity(newshelf);
		System.out.println("Prateleira adicionada com sucesso!");
		return 1;
	}

	
}

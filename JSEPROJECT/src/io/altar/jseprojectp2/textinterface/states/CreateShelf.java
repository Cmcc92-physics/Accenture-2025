package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.repository.ShelfRepository;

public class CreateShelf extends State {
	private ShelfRepository shelfList = ShelfRepository.getInstance();

	@Override
	public int on() {
		System.out.println("Insira a capacidade da nova prateleira:");
		int capacity = scanner.nextInt();
		System.out.println("Insira o preço de aluguer da prateleira:");
		double dailyPrice = scanner.nextDouble();
		Shelf newShelf = new Shelf(capacity, dailyPrice);
		shelfList.add(newShelf);
		return 1;
	}

}

package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

public class UpdateShelf extends State {
	private ShelfService SS = new ShelfService();

	@Override
	public int on() {
		int index = scanner.getInt("Inserir o Id da prateleira a editar:");
		scanner.getValue();

		Shelf updateShelf = SS.getEntity(index);
		if (updateShelf != null) {
			int newCapacity = scanner.getInt("Inserir nova capacidade:");
			updateShelf.setCapacity(newCapacity);

			int newProductId = scanner.getInt("Inserir um novo produto Id:");
			updateShelf.setProductID(newProductId);

			double newdailyPrice = scanner.getDouble("Inserir o novo preço diário:");
			updateShelf.setDailyPrice(newdailyPrice);
			SS.editEntity(updateShelf);

		} else {
			System.out.println("Id inválido");
		}
		return 1;
	}

}

package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.repository.ShelfRepository;

public class UpdateShelf extends State {
	private ShelfRepository shelfList = ShelfRepository.getInstance();
	
	@Override
	public int on() {
		System.out.println("Inserir o Id da prateleira a editar:");
		int index = scanner.nextInt();
		scanner.nextLine();

		Shelf updateShelf = shelfList.getById(index);
		if (updateShelf != null) {
			System.out.println("Inserir nova capacidade:");
			int newCapacity = scanner.nextInt();
			updateShelf.setCapacity(newCapacity);
			System.out.println("Inserir um novo produto Id:");
			int newProductId = scanner.nextInt();
			updateShelf.setProductID(newProductId);
			System.out.println("Inserir nova novo daily price:");
			double newdailyPrice = scanner.nextDouble();
			updateShelf.setDailyPrice(newdailyPrice);
			shelfList.edit(updateShelf);

		} else {
			System.out.println("Id inválido");
		}
		return 1;
	}

}

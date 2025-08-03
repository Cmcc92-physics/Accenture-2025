package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

public class UpdateShelf extends State {
	private ShelfService SS = new ShelfService();

	@Override
	public int on() {
		int index;
		int newCapacity;
		int newProductId;
		double newDailyPrice;
		
	
		index = scanner.getInt("Inserir o Id da prateleira a editar:");
		scanner.getValue();

		Shelf updateShelf = SS.getEntity(index);
		
		
		if (updateShelf != null) {
			
			
				while (true) {
					newCapacity = scanner.getInt("Inserir nova capacidade:");
					if (newCapacity > 0) {
						System.out.println("Nova Capacidade válida!");
						break;
					} else {
						System.out.println("Nova capacidade da prateleira inválida. Apenas são permitidos números.");
					}
					updateShelf.setCapacity(newCapacity);
				}
		
			
				while (true) {
					
					newProductId = scanner.getInt("Inserir um novo produto Id:");
					if (newProductId >=0) {
						System.out.println("Novo produto Id válido!");
						break;
						
					} else {
						System.out.println("Novo produto Id inválido. Apenas são permitidos números.");
					}
					updateShelf.setProductID(newProductId);
				}
				
				
				while (true) {
					newDailyPrice = scanner.getDouble("Inserir um novo preço diário de aluguer da prateleira(€):");	
					if (newDailyPrice >= 0) {
						System.out.println("Novo preço diário de aluguer da prateleira válido!");
						break;
					} else {
						System.out.println("Novo preço diário de aluguer da prateleira inválido. Apenas são permitidos números.");
					}
					updateShelf.setDailyPrice(newDailyPrice);	
				}
					
						
			SS.editEntity(updateShelf);

		}
		return 1;
	}
}


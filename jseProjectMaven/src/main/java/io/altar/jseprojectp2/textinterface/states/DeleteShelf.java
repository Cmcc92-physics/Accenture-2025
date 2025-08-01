package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.services.ShelfService;

public class DeleteShelf extends State {
	private ShelfService SS = new ShelfService();

	@Override
	public int on() {
		if (SS.isEmpty()) {
			System.out.println("Não existem prateleiras na bd.");
		} else {
			System.out.println("Ids de prateleiras na bd:");
			SS.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});

			SS.removeEntity(scanner.getInt("Qual é o Id que pretende remover:"));
		}

		return 1;
	}


}

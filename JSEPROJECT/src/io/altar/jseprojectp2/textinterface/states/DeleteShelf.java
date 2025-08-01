package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.repository.ShelfRepository;

public class DeleteShelf extends State {
	private ShelfRepository shelfList = ShelfRepository.getInstance();
	
	@Override
	public int on() {
		if (shelfList.isEmpty()) {
			System.out.println("Não existem prateleiras na bd.");
		} else {
			System.out.println("Ids de prateleiras na bd:");
			shelfList.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});
			System.out.println("Qual é o Id que pretende remover:");
			shelfList.remove(scanner.nextInt());
		}
	
		return 1;
	}

}

package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.repository.ShelfRepository;

public class ReadShelf extends State {
	private ShelfRepository shelfList = ShelfRepository.getInstance();
	
	@Override
	public int on() {
		if (shelfList.isEmpty()) {
			System.out.println("Não existem prateleiras na base de dados.");
		} else {
			System.out.println("Ids de prateleiras na bd:");
			shelfList.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});
			System.out.println("Qual é o Id que pretende consultar:");
			int consultId = scanner.nextInt();
			System.out.println(shelfList.getById(consultId).toString());
		}
		return 1;
	}

}

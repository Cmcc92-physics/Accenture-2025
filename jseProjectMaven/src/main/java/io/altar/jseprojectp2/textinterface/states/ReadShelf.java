package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.services.ProductService;
import io.altar.jseprojectp2.services.ShelfService;

public class ReadShelf extends State {
	private ShelfService SS = new ShelfService();
	private ProductService PS = new ProductService();
	
	@Override
	public int on() {
		if (SS.isEmpty()) {
			System.out.println("Não existem prateleiras na bd.");
		} else {
			System.out.println("Ids de prateleiras na bd:");
			SS.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});
			int consultId = scanner.getInt("Qual é o Id que pretende consultar:");
			if(SS.getEntity(consultId) != null) {
				System.out.println(SS.getEntity(consultId).toString());		
				if(PS.getEntity(SS.getEntity(consultId).getEntityId() ) != null) {
					System.out.println("A prateleira contém o produto: " + PS.getEntity(SS.getEntity(consultId).getEntityId()).getProducName().toString());
				}
			}else {
				System.out.println("Não existe nenhuma prateleira com este Id!");
			}
		}
		return 1;
	}


}

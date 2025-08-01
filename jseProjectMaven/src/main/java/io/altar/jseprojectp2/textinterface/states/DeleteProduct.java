package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.services.ProductService;

public class DeleteProduct extends State {
	private ProductService PS = new ProductService();
	
	@Override
	public int on() {
		if (PS.isEmpty()) {
			System.out.println("Não existem produtos na bd.");
		} else {
			System.out.println("Ids de produtos na bd:");
			PS.getAllIds().forEach((Integer id) -> {
				System.out.println("Produto Id: " + id);

			});
			PS.removeEntity(scanner.getInt("Qual é o Id que pretende remover:"));
		}
	
		return 1;
	}

}

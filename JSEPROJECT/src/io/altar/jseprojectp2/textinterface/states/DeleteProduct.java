package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.repository.ProductRepository;

public class DeleteProduct extends State {
	private ProductRepository productList = ProductRepository.getInstance();
	
	@Override
	public int on() {
		if (productList.isEmpty()) {
			System.out.println("Não existem produtos na bd.");
		} else {
			System.out.println("Ids de produtos na bd:");
			productList.getAllIds().forEach((Integer id) -> {
				System.out.println("Produto Id: " + id);

			});
			System.out.println("Qual é o Id que pretende remover:");
			productList.remove(scanner.nextInt());
		}
	
		return 1;
	}

}

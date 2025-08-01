package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.repository.ProductRepository;

public class ReadProduct extends State {
	private ProductRepository productList = ProductRepository.getInstance();
	
	@Override
	public int on() {
		if (productList.isEmpty()) {
			System.out.println("Não existem produtos na bd");
		} else {
			System.out.println("Ids de produtos na bd:"); //
			productList.getAllIds().forEach((Integer id) -> {
				System.out.println("Produto Id: " + id);
			});

			System.out.println("Qual é o Id que pretende consultar:");
			int consultId = scanner.nextInt();
			System.out.println(productList.getById(consultId).toString());
		}
		return 1;
	}

}

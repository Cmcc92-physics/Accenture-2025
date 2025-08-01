package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.ProductRepository;

public class CreateProduct extends State {
	private ProductRepository productList = ProductRepository.getInstance();

	@Override
	public int on() {
		System.out.println("Insira o novo produto:");
		String productName = scanner.nextLine();
		System.out.println("Insira o valor unitário de desconto:");
		Double unitDiscount = scanner.nextDouble();
		System.out.println("Insira o IVA");
		Double iva = scanner.nextDouble();
		System.out.println("Insira o preço de venda ao público:");
		Double publicPrice = scanner.nextDouble();
		Product newProduct = new Product(productName, null, unitDiscount, iva, publicPrice);
		productList.add(newProduct);
		System.out.println("Produto adicionado com sucesso!");
		return 1;
	}

}

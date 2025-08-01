package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.services.ProductService;

public class CreateProduct extends State {

	double unitDiscount = 0;
	double iva = 0;
	String productName;
	double publicPrice = 0;

	private ProductService PS = new ProductService();

	@Override
	public int on() {

		// Quando introduzo 123 passa logo para o valor unitário desconto.
		while (true) {
			System.out.println("Insira o novo produto:");
			productName = scanner.getValue();

			if (productName.matches("[a-zA-ZÀ-ÿ-\\s]+")) {
				System.out.println("Nome do produto válido! ");
				break;
			} else {
				System.out.println("Nome do produto inválido! Apenas letras e espaços são permitidos.");

			}
		}

		while (true) {
			unitDiscount = scanner.getDouble("Insira o valor unitário de desconto (0 - 100):");
			if (unitDiscount >= 0 && unitDiscount < 100) {
				break;
			}
		}

		while (true) {
			iva = scanner.getDouble("Insira o IVA (6% / 13% / 23%):");
			if (iva != 6 && iva != 13 && iva != 23) {
				System.out.println("IVA inválido: " + iva + ". Só são permitidos os IVA's de 6%, 13% e 23%.");
			} else {
				break;
			}

		}
// Como criar uma expecção quando o preço for 0 o programa rebenta.
			while (true) {
			publicPrice = scanner.getDouble("Insira o preço de venda ao público (>=0):");

			if (publicPrice < 0) {
				System.out.println("Preço de venda ao público introduzido incorretamente! Introduzir um valor (>=0)");
			} else {
				break;
			}
		}

		Product newProduct = new Product(productName, unitDiscount, iva, publicPrice);
		PS.addEntity(newProduct);
		System.out.println("Produto adicionado com sucesso!");

		return 1;
	}
}
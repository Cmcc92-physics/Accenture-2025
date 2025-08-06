package io.altar.jseprojectp2.textinterface;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.services.ProductService;

public class ProductManager {
	static Scanner scanner = new Scanner(System.in);

	private static ProductService PS = new ProductService();

	public void showMenuProduct() {
		int productChoice = -1;

		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		System.out.print("Escolha uma opção: ");

		boolean condition = true;
		while (condition) {

			try {
				productChoice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Atenção!!! Só são permitidos números.");
				scanner.nextLine();
			}

			switch (productChoice) {
			case 1:
				System.out.println("***Você escolheu criar um novo produto");
				addProduct();
				break;
			case 2:
				System.out.println("Você escolheu editar um produto existente");
				editProduct();
				break;
			case 3:
				System.out.println("Você escolheu consultar o detalhe de um produto");
				consultProduct();
				break;
			case 4:
				System.out.println("Você escolheu remover um produto");
				removeProduct();
				break;
			case 5:
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	// Criar um novo produto
	public static void addProduct() {
		scanner.nextLine();
		System.out.println("Insira o novo produto:");
		String productName = scanner.nextLine();

		if (productName.matches("[a-zA-ZáéíóúÁÉÍÓÚãõÃÕçÇ ]")) {
			System.out.println("Nome do produto válido!");
		} else {
			System.out.println("Nome do produto inválido! Apenas letras são permitidas.");

			Double unitDiscount = null;

			while (true) {
				System.out.println("Insira o valor unitário do desconto (%):");
				unitDiscount = scanner.nextDouble();
				if (unitDiscount >= 0 && unitDiscount < 100) {
					break;
				}
			}

			Double iva = null;

			while (true) {
				System.out.println("Insira o IVA (6% /13% / 23%):");
				iva = scanner.nextDouble();
				if (iva != 6 && iva != 13 && iva != 23) {
					System.out.println("IVA inválido: " + iva + ". Só são permitidos os IVA's de 6%, 13% e 23%.");
				} else {
					System.out.println("IVA introduzido corretamente!");
					break;
				}

			}

			Double publicPrice = null;

			while (true) {
				System.out.println("Insira o preço de venda ao público:");
				publicPrice = scanner.nextDouble();
				if (publicPrice < 0) {
					System.out.println("Preço de venda ao público introduzido incorretamente!");
				} else {
					break;
				}
			}

			Product newProduct = new Product(null, unitDiscount, iva, publicPrice); // Retirado o ProductName
			PS.addEntity(newProduct);
			System.out.println("Produto adicionado com sucesso!");

		}
	}
	

	// Atualiza um produto baseado no seu index
	public void editProduct() {
		System.out.println("inserir o Id do produto a editar");
		int index = scanner.nextInt();
		scanner.nextLine();

		Product updateProduct = PS.getEntity(index);
		if (updateProduct != null) {
			System.out.println("Inserir novo produto:");
			String newProductName = scanner.nextLine();
			updateProduct.setProductName(newProductName);

			System.out.println("Inserir de novo a lista de prateleiras:");
			List<Integer> ids = new ArrayList<Integer>();
			String list = scanner.nextLine();
			String[] stringArray = list.split(" ");
			
			for (int i=0; i< stringArray.length; i++ ) {
				int id = Integer.parseInt(stringArray[i]);
				ids.add(id);
				System.out.println(id);
		
			}
		
			
			updateProduct.setShelfList(ids);
			

			System.out.println("Inserir o novo valor unitário de desconto (%)");
			Double newUnitDiscount = scanner.nextDouble();
			updateProduct.setUnitDiscount(newUnitDiscount);
			System.out.println("Inserir o novo IVA (%)");
			Double newIva = scanner.nextDouble();
			updateProduct.setIva(newIva);
			System.out.println("Inserir o novo preço de venda ao público (€):");
			Double newProductPrice = scanner.nextDouble();
			updateProduct.setPublicPrice(newProductPrice);
		} else {
			System.out.println("Id inválido");
		}
	}

	// Consultar produto
	public void consultProduct() {
		if (PS.isEmpty()) {
			System.out.println("Não existem produtos na bd");
		} else {
			System.out.println("Ids de produtos na bd:"); //
			PS.getAllIds().forEach((Integer id) -> {
				System.out.println("Produto Id: " + id);
			});

			System.out.println("Qual é o Id que pretende consultar:");
			int consultId = scanner.nextInt();
			System.out.println(PS.getEntity(consultId).toString());
		}
	}

	public void removeProduct() {
		if (PS.isEmpty()) {
			System.out.println("Não existem produtos na bd.");
		} else {
			System.out.println("Ids de produtos na bd:");
			PS.getAllIds().forEach((Integer id) -> {
				System.out.println("Produto Id: " + id);

			});
			System.out.println("Qual é o Id que pretende remover:");
			PS.removeEntity(0);
		}
	}
}

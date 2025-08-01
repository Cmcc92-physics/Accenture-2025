
package io.altar.jseprojectp2.textinterface;

import java.util.InputMismatchException;
import java.util.Scanner;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

public class ShelfManager {
	Scanner scanner = new Scanner(System.in);

	private ShelfService SS = new ShelfService();

	private Object updateSheld;

	public void showMenuShelf() {
		int shelfChoice = -1;

		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar uma nova prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		System.out.print("Escolha uma opção: ");

		boolean condition = true;
		while (condition) {

			try {
				shelfChoice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Atenção!!! Só são permitidos números.***");
				scanner.nextLine();
			}

			switch (shelfChoice) {
			case 1:
				System.out.println("***Você escolheu criar uma nova prateleira.***");
				scanner.nextLine();
				newShelf();
				break;
			case 2:
				System.out.println("***Você escolheu editar uma prateleira existente.***");
				editShelf();
				break;
			case 3:
				System.out.println("***Você escolheu consultar o detalhe de uma parteleira.***");
				consultShelf();
				break;
			case 4:
				System.out.println("***Você escolheu remover uma prateleira.***");
				removeShelf();
				break;
			case 5:
				System.out.println("Voltar ao menu anterior");
				scanner.nextLine();
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

	// Criar uma nova prateleira
	public void newShelf() {
		int capacity;
		double dailyPrice;
		while (true) {
			System.out.println("Insira a capacidade da nova prateleira:");
			capacity = scanner.nextInt();
			if (capacity > 0) {
				System.out.println("Capacidade da nova prateleira válida!");
				break;
			} else {
				System.out.println("Capacidade da prateleira inválida. Apenas são permitidos números.");
			}
		}

		while (true) {
			System.out.println("Insira o preço diário de aluguer da prateleira (€):");
			dailyPrice = scanner.nextDouble();
			if (dailyPrice >= 0) {
				System.out.println("Preço diário válido!");
				break;
			} else {
				System.out.println("Preço diário inválido. Apenas são permitidos números.");
			}
		}

		Shelf newShelf = new Shelf(capacity, dailyPrice);
		SS.addEntity(newShelf);
		System.out.println("Prateleira adicionada com sucesso!");

		// System.out.println(newShelf.toString());
	}

	// Atualiza uma prateleira baseado no seu index
	public void editShelf() {
		System.out.println("Inserir o Id da prateleira a editar:");
		int index = scanner.nextInt();
		scanner.nextLine();

		Shelf updateShelf = SS.getEntity(index);
		if (updateSheld != null) {
			while (true) {
				System.out.println("Inserir nova capacidade:");
				int newCapacity = scanner.nextInt();
				if (newCapacity > 0) {
					System.out.println("Nova Capacidade válida!");
					break;
				} else {
					System.out.println("Nova capacidade da prateleira inválida. Apenas são permitidos números.");
				}
				updateShelf.setCapacity(newCapacity);
			}

			while (true) {
				System.out.println("Inserir um novo produto Id:");
				int newProductId = scanner.nextInt();
				if (newProductId >=0) {
					System.out.println("Novo produto Id válido!");
					break;
					
				} else {
					System.out.println("Novo produto Id inválido. Apenas são permitidos números.");
				}
				updateShelf.setProductID(newProductId);
			}
			System.out.println("Inserir um novo preço diário de aluguer da prateleira(€):");
			double newdailyPrice = scanner.nextDouble();
			
			
			
			
			updateShelf.setDailyPrice(newdailyPrice);
			SS.editEntity(updateShelf);

		} else {
			System.out.println("Id inválido");
		}
	}

	// Consultar item da prateleira
	public void consultShelf() {
		if (SS.isEmpty()) {
			System.out.println("Não existem prateleiras na base de dados.");
		} else {
			System.out.println("Ids de prateleiras na base de dados:");
			SS.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});
			System.out.println("Qual é o Id que pretende consultar:");
			int consultId = scanner.nextInt();
			System.out.println(SS.getEntity(consultId).toString());
		}
	}

	public void removeShelf() {
		if (SS.isEmpty()) {
			System.out.println("Não existem prateleiras na base de dados.");
		} else {
			System.out.println("Ids de prateleiras na base de dados:");
			SS.getAllIds().forEach((Integer id) -> {
				System.out.println("Prateleira Id: " + id);

			});
			System.out.println("Qual é o Id que pretende remover:");
			SS.removeEntity(scanner.nextInt());

		}

	}
}

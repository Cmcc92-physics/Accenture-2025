package io.altar.jseprojectp2.textinterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextInterface {
//	public static void main(String[] args) {
	// mainMenu();
	// }
	Scanner scanner = new Scanner(System.in);
	public void mainMenu() {

		int opcao = -1;
		
		do {
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1) Listar produtos");
			System.out.println("2) Listar prateleiras");
			System.out.println("3) Sair");
			System.out.print("Escolha uma opção: ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Atenção!!! Só são permitidos números.");
				scanner.nextLine();
			}

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu Listar produtos.");
				product();
				break;
			case 2:
				System.out.println("Você escolheu Listar prateleiras");
				shelf();
				break;
			case 3:
				System.out.println("Sair... Até logo!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			System.out.println(); // Linha em branco para melhor visualização
		} while (opcao != 3);

		
	}

	public void product() {
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
				System.out.println("Você escolheu criar um novo produto");
				condition = false;
				break;
			case 2:
				System.out.println("Você escolheu editar um produto existente");
				condition = false;
				break;
			case 3:
				System.out.println("Você escolheu consultar o detalhe de um produto");
				condition = false;
				break;
			case 4:
				System.out.println("Você escolheu remover um produto");
				condition = false;
				break;
			case 5:
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		}
	}
	
	public void shelf() {
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
				System.out.println("Atenção!!! Só são permitidos números.");
				scanner.nextLine();
			}

			switch (shelfChoice) {
			case 1:
				System.out.println("Você escolheu criar um novo produto");
				condition = false;
				break;
			case 2:
				System.out.println("Você escolheu editar um produto existente");
				condition = false;
				break;
			case 3:
				System.out.println("Você escolheu consultar o detalhe de um produto");
				condition = false;
				break;
			case 4:
				System.out.println("Você escolheu remover um produto");
				condition = false;
				break;
			case 5:
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		}
	}
	
}

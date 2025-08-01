package io.altar.jseprojectp2.textinterface;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TextInterface {

	// Utility for reading and validating user input from the console
	

	// Singleton instance of the production repository

	// Singleton in Java ensures that a class has only one instance and provides a
	// global point of access to it. This is particularly useful for managing shared
	// resources like database connection, logging, or configuration settings.

	// getInstance() is used to get an implementation of a Signature object for a
	// specified algorithm.
	// private ProductRepository productObject = ProductRepository.getInstance();

	// Singleton instance of shelf repository
	// private ShelfRepository shelfObject = ShelfRepository.getInstance();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		ProductManager gestorProdutos = new ProductManager();
		ShelfManager gestorPrateleira = new ShelfManager();

		do {
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1) Menu produtos");
			System.out.println("2) Menu prateleiras");
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
				System.out.println("***Você escolheu Listar produtos.***");
				gestorProdutos.showMenuProduct();
				break;
			case 2:
				System.out.println("***Você escolheu Listar prateleiras.***");
				gestorPrateleira.showMenuShelf();
				break;
			case 3:
				System.out.println("Sair... Até logo!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			System.out.println(); // Linha em branco para melhor visualização
		} while (opcao != 3); 

		scanner.close();
		}
	
	

}

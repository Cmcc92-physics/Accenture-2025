package pt.academy.examples;

import java.util.Scanner;

public class NameAge {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

				
		System.out.println("Inserir nome e idade:");
		String nome = sc.next();

		int idade = -1;
		while (idade <= 0) {
			if (sc.hasNextInt()) {
				idade = sc.nextInt();// sc.nextLine() limpar buffer
				if (idade <= 0) {
					System.out.println("A idade 0 não é válida.");
				}

			} else {
				sc.next();
				System.out.println("A idade não é válida.");
			}

		}

		System.out.println("O meu nome é, " + nome + " e tenho " + idade + " anos de idade.");

		sc.close();
	}
}

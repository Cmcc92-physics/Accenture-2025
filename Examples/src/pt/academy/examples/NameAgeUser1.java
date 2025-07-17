package pt.academy.examples;

import java.util.Scanner;

public class NameAgeUser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir primeiro nome:");
		String firstname = sc.nextLine();
		System.out.println("Inserir último nome:");
		String lastname = sc.nextLine();
		System.out.println("Inserir genero(f/m):");
		String gender = sc.nextLine();

		System.out.println("Inserir a idade:");

		int idade = -1;
		while (idade <= 0) {
			if (sc.hasNextInt()) {
				idade = sc.nextInt();// sc.nextLine() limpar buffer
				sc.nextLine();
				if (idade <= 0) {
					System.out.println("A idade 0 não é válida.");
				}
			} else {
				sc.next();
				System.out.println("A idade não é válida.");
			}

		}

		System.out.println("Inserir a cidade onde vive:");
		String city = sc.nextLine();

		User user = new User(firstname, lastname, gender, idade, city); // Objecto da classe user

		System.out.println("Deseja alterar o seu primeiro nome (yes/no):");
		String answer = sc.nextLine().trim().toLowerCase();
		if (answer.equals("yes")) {
			System.out.println("Alterar o primeiro nome:");
			String newfirstname = sc.nextLine();
			user.setfirstName(newfirstname);
		} else if (answer.equals("no")) {
			System.out.println("O seu primeiro nome não será alterado!");
		} else if (answer.equals("")){
			System.out.println("Por favor responder 'yes' ou 'no'.");
			sc.nextLine();
		}
		

		/*
		 * Key Points: Input Handling: The trim() method removes extra spaces, and
		 * toLowerCase() ensures case-insensitivity. Validation: The program checks if
		 * the input is "yes" or "no" and provides feedback accordingly. User-Friendly:
		 * If the input is invalid, it prompts the user to provide a proper response.
		 * This is a simple and effective way to handle yes/no questions in Java!
		 */

		user.print();

		sc.close();

	}}





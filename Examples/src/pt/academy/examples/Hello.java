package pt.academy.examples;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserir nome,");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		System.out.println("Hello " + nome + "!!!");
		sc.close();
	}

}

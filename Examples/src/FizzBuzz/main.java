package FizzBuzz;

import java.util.Scanner;



public class main {

	public static void main (final String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserir um número:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % 3 == 0 && i % 5 == 0) {
				System.out.println("- FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("- Fizz");
			} else if (i % 5 == 0) {
				System.out.println("- Buzz");
			} else {
				System.out.println(i);
		}
		sc.close();
		}

	}
}
package gamabank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int op;

		do {
			System.out.println("1.Abrir Conta");
			System.out.println("2.Sacar");
			System.out.println("3.Depositar");
			System.out.println("4.Saldo");
			System.out.println("5.Sair");
			op = input.nextInt();

		} while (op != 5);

	}
}

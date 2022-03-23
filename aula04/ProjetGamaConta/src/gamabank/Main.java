package gamabank;

import java.util.Scanner;

import conta1.ContaCorrente;
import conta1.ContaPoupanca;

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
			
			if(op==1) {
				int oc;
				System.out.println("Qual o tipo de conta?\n1.Poupança\n2.Corrente");
			    oc = input.nextInt();
				if(oc==1)  {
		        ContaPoupanca cp =  new ContaPoupanca();
			}else {
		      ContaCorrente cc = new ContaCorrente();
		    }
			System.out.println("Conta criada com sucesso");
			
			}
			
		}while(op!=5); 
}
}			
import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   int maior;
   int menor;
   
   
   System.out.println("digite um número");
menor = ler.nextInt();

System.out.println("outro número");
maior = ler.nextInt();

do {
	menor++;
	System.out.println(menor);
} while(menor < maior);
}
}


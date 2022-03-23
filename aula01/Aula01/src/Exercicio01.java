import java.util.Scanner;

public class Exercicio01 {
		  public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);  
		    
		    // vamos solicitar as duas notas do aluno
		    double n1, n2, media;
		    System.out.print("Informe a primeira nota: ");
		    n1 = Double.parseDouble(entrada.nextLine());
		    System.out.print("Informe a segunda nota: ");
		    n2 = Double.parseDouble(entrada.nextLine());
		    
		    // vamos calcular a m�dia aritm�tica
		    media = (n1 + n2) / 2;
		    System.out.println("A m�dia obtida foi: " + media);
		    
		    // vamos verificar se o aluno foi reprovado, est� de exame ou aprovado
		    if(media < 4.0){ // reprovado
		      System.out.println("Reprovado");
		    }
		    if((media >= 4.0) && (media < 7.0)){ // exame
		      System.out.println("Exame");
		    }
		    else{
		      System.out.println("Aprovado");  
		    }
		    
		    System.out.println("\n");
		  }
		}



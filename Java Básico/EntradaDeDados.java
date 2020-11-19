package cursoemvideo;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = teclado.nextLine();
			
		System.out.println("Digite a nota do aluno: ");
		float notaAluno = teclado.nextFloat();
			
		System.out.println("\nA nota de " + nomeAluno + " é " + notaAluno);
	}
}

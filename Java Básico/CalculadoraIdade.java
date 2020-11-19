package cursoemvideo;

import java.util.Scanner;

public class CalculadoraIdade {
	
	public static void main(String[] args) {
		
		int anoAtual = 2020;
		
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = new Scanner(System.in).nextInt();
		
		int idadeUsuario = anoAtual - anoNascimento;
		
		System.out.println("\nA idade do usuário é: " + idadeUsuario);
	}
}

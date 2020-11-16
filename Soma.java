package cursoemvideo;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite o 1º: ");
		int primeiroNumero = enter.nextInt();
		
		System.out.println("Digite o 2º: ");
		int segundoNumero = enter.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("\nSoma = " + soma);
	}
}

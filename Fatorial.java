package cursoemvideo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		try (Scanner enter = new Scanner(System.in)) {
			System.out.println("Digite o número da fatorial que deseja ver: ");
			int numero = enter.nextInt();
			int fatorial = 1;
			int contador = numero;
			
			while(contador>=1) {
				fatorial *= contador;
				contador--;
			}
			
			System.out.println("\nFatorial de " + numero + " é " + fatorial);
		}
	}
}

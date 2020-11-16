package cursoemvideo;

import java.util.Scanner;

public class EstruturaRepeticaoPart2 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		String resp;
		Scanner enter = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um valor: ");
			numero = enter.nextInt();
			soma += numero;
			
			System.out.println("\nQuer continuar? [S/N] ");
			resp = enter.next();
			
		} while(resp.equals("S"));
		
		System.out.println("\nA soma de todos os valores é: " + soma);
	}
}

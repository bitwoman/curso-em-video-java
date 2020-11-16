package cursoemvideo;

import java.util.Scanner;

public class EstruturasCondicionaisPart1 {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
			
		System.out.println("Digite um primeiro número: ");
		float numeroUm = enter.nextFloat();
		
		System.out.println("Digite um segundo número: ");
		float numeroDois = enter.nextFloat();
		
		float media = (numeroUm + numeroDois)/2;
		
		System.out.println("Sua média foi: " + media);
		
		if(media > 9) {
			System.out.println("Parabéns!");
		}	
	}
}

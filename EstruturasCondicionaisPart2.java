package cursoemvideo;

import java.util.Scanner;

public class EstruturasCondicionaisPart2 {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite o ano que você nasceu: ");
		int anoNascimento = enter.nextInt();
		int idade = 2020 - anoNascimento;
		
		if(idade < 16) {
			System.out.println("\nVocê ainda não pode votar!");
		}else {
			if(idade >= 16 && idade > 60) {
				System.out.println("\nVoto opcional!");
			}else {
				System.out.println("\nVoto obrigatório!");
			}
			
		
//		AULA 10 - FINAL:
/*			switch(perna) {
				case 1:
					tipo = "Saci";
					break;
				case 2:
					tipo = "Bípede";
					break;
				case 3:
					tipo = "Tripé";
					break;
				case 4:
					tipo = "Quadrúpede";
					break;
				case 5:
					tipo = "Aranha";
					break;
				default:
					tipo = "ET";
					break;
			}*/
		}
	}
}

package cursoemvideo;

import java.util.Scanner;

public class ClasseMath {

	public static void main(String[] args) {
//		double constante = Math.PI;
		Scanner entradaDados = new Scanner(System.in); 
		
		System.out.println("Digite um valor qualquer: ");
		int n1 = entradaDados.nextInt();
		
		System.out.println("Digite um valor qualquer: ");
		int n2 = entradaDados.nextInt();
		
		float divisao = n1/n2;
		float res = n1%n2;
		float raizQuadrada = (float) Math.sqrt(res);
		float raizQuadradaAritmetica = Math.round((float) Math.sqrt(res));
		
//		Math.abs(-10) - Valor absoluto - 10
//		Math.floor(3.9) - Arredonda para baixo - 3
//		Math.ceil(4.2) - Arredonda para cima - 5
//		Math.round(5.6) - Arredonda aritmeticamente - 6
//		Math.random() - Gerador de números aleatórios de 0 e 1. 
//		Com intervalos específicos: 5 + Math.random() * (10-5) -> num intervalo de 5 e 10, por exemplo.
//		double ale = Math.random()
//		int n = (int) (5 + ale * (10-5));
		
		
		System.out.println("\nDivisão: " + divisao + "\n" + "Resto: " + res + "\n" + "Raiz quadrada de resto: " + raizQuadrada + "\n" + "Raiz quadrada de resto arredondada "
				+ "aritmeticamente: " + raizQuadradaAritmetica);
	}
}

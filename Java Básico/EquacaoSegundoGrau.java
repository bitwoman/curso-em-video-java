package cursoemvideo;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		int x1 = 0, x2 = 0;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = enter.nextInt();
		
		System.out.println("Digite o valor de a: ");
		int b = enter.nextInt();
		
		System.out.println("Digite o valor de a: ");
		int c = enter.nextInt();
		
		double d = Math.pow(b, 2) - 4 * a * c;
		double raizQuadradaDelta = Math.sqrt(d);
		
		if(d < 0) {
			
			System.out.println("\nRaiz de Delta: " + raizQuadradaDelta);
			System.out.println("\nNão existem raízes reais.");
			
		}else {
			
			x1 = (int) ((-b + raizQuadradaDelta)/2*a);
			x2 = (int) ((-b - raizQuadradaDelta)/2*a);
			
			System.out.println("\nRaiz de Delta: " + raizQuadradaDelta);
			System.out.println("\nExistem raízes reais: ");
			System.out.println("X1 = " + x1 + "\n" + "X2 = " + x2);
		}
	}
}

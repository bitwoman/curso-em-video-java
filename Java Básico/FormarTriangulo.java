package cursoemvideo;

import java.util.Scanner;

public class FormarTriangulo {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado A: ");
		int a = enter.nextInt();
		
		System.out.println("Digite o valor do lado B: ");
		int b = enter.nextInt();
		
		System.out.println("Digite o valor do lado C: ");
		int c = enter.nextInt();
		
		if(a<b+c && b<a+c && c<a+b) {
			
			System.out.println("\nÉ possível formar um triângulo!");
			
			if(a==b && b==c) {
				System.out.println("\nEquilátero!");
			}else if(a!=b && b!=c && a!=c) {
				System.out.println("Escaleno!");
			}else {
				System.out.println("Isósceles!");
			}
		}else {
			System.out.println("\nNão é possível formar um triângulo!");
		}
	}
}

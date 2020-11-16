package cursoemvideo;

import java.util.Arrays;

public class VetoresPart2 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		
//		Todas posições serão preenchidas com 8.
		Arrays.fill(vetor, 8);
		
		
		for(int v:vetor) {
			System.out.println(v + " ");
		}
		
		System.out.println("");
		int p = Arrays.binarySearch(vetor, 8);

		System.out.println("Encontrei o velor na posição: " + p);
	}
}

package cursoemvideo;

public class Metodo {

	static void soma(int a, int b) {
		int soma = a + b;
		System.out.println("A soma é: " + soma);
	}
		
	public static void main(String[] args) {
		
		//Torno ele estático: apenas funcional dentro da classe.
		
		System.out.println("Começou!");
		soma(5,2);

	}
}

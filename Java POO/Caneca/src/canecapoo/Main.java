package canecapoo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("PRIMEIRA INSTÂNCIA DE CANECA: \n");
		
		Caneca caneca1 = new Caneca();
		caneca1.cor = "Preta";
		caneca1.modelo = "Quadrada";
		caneca1.tamanho = 15.0f; //centímetros 
		caneca1.encherCaneca();
		caneca1.esvaziarCaneca();
		caneca1.statusCaneca();
		
		
		System.out.println("\n============================\n");
		System.out.println("SEGUNDA INSTÂNCIA DE CANECA: \n");
		
		Caneca caneca2 = new Caneca();
		caneca2.cor = "Amarela e Preta";
		caneca2.modelo = "Redonda";
		caneca2.tamanho = 16.0f; //centímetros 
		caneca2.encherCaneca();
		caneca2.statusCaneca();
	}
}

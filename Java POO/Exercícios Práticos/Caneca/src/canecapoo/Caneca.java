package canecapoo;

public class Caneca {
	
	String cor, modelo;
	double tamanho; 
	boolean cheia;
	
	void statusCaneca() {
		System.out.println("Uma caneca de cor " + this.cor);
		System.out.println("O modelo da caneca �: " + this.modelo);
		System.out.println("Qual o tamanho dela? " + this.tamanho);
		System.out.println("Est� cheia? " + this.cheia);
	}
	
	void encherCaneca() {
		if(this.cheia == true) {
			System.out.println("Ela j� est� cheia de CAF�!");
		}else {
			this.cheia = true;
			System.out.println("Enchendo...");
		}
	}
	
	void esvaziarCaneca() {
		if(this.cheia == false) {
			System.out.println("Ela j� est� VAZIA!");
		}else {
			this.cheia = false;
			System.out.println("Esvaziando...");
		}
	}	
}

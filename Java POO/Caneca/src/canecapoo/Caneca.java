package canecapoo;

public class Caneca {
	
	String cor, modelo;
	double tamanho; 
	boolean cheia;
	
	void statusCaneca() {
		System.out.println("Uma caneca de cor " + this.cor);
		System.out.println("O modelo da caneca é: " + this.modelo);
		System.out.println("Qual o tamanho dela? " + this.tamanho);
		System.out.println("Está cheia? " + this.cheia);
	}
	
	void encherCaneca() {
		if(this.cheia == true) {
			System.out.println("Ela já está cheia de CAFÉ!");
		}else {
			this.cheia = true;
			System.out.println("Enchendo...");
		}
	}
	
	void esvaziarCaneca() {
		if(this.cheia == false) {
			System.out.println("Ela já está VAZIA!");
		}else {
			this.cheia = false;
			System.out.println("Esvaziando...");
		}
	}	
}

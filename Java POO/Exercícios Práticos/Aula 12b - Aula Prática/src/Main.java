//POLIMORFISMO DE SOBREPOSIÇÃO:
public class Main {
	
	public static void main(String[] args) {
//		Criando objetos:
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru canguru = new Canguru();
		Cachorro cao = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish goldfish = new Goldfish();
		Arara arara = new Arara();
		
		canguru.locomover();
		canguru.emitirSom();
		
		System.out.println("\n");
		
		cao.locomover();
		cao.emitirSom();
	}
}

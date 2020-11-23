
public class Cachorro extends Mamifero {

//	Métodos personalizados:
	public void buscarOsso() {
		System.out.println("Buscando osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
}

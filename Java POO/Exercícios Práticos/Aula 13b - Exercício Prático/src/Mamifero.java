
public class Mamifero extends Animal {
//	Atributos:
	protected String corPelo;
	
//	Getters and Setters:
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	//	Polimorfismo:
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");	
	}
}

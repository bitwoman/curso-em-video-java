
public class Ave extends Animal {
//	Atributos:
	private String corPena;
	
//	Métodos personalizados:
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}
}

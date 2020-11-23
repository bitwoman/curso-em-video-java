
public class Peixe extends Animal {

	private String corEscama;
	
//	Método personalizado:
	public void soltarBolha() {
		System.out.println(" o O o O o O");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
}

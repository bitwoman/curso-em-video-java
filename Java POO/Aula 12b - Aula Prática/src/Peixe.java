
public class Peixe extends Animal {

	private String corEscama;
	
//	M�todo personalizado:
	public void soltarBolha() {
		System.out.println(" o O o O o O");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
	}
}

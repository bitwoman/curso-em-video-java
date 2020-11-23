
public class Bolsista extends Aluno {

//	POLIMORFISMO: sobrepor um m�todo para realiz�-lo de uma maneira diferente 
//	da super classe.
	
	private float bolsa;
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " � bolsista! Pagamento facilitado!");
	}
}

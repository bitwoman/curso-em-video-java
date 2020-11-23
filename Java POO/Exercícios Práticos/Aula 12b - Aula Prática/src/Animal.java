//Classe abstrata: n�o pode ser instanciada, � utilizada apenas para heran�a.
public abstract class Animal {
//	Atributos:
	protected float peso;
	protected int idade;
	protected int membros;
	
//	M�todos abstratos de animais (apenas as filhas ir�o desenvolver):
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
//	Getters and Setters:
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}

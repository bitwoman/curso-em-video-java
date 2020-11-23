//Classe abstrata: não pode ser instanciada, é utilizada apenas para herança.
public abstract class Animal {
//	Atributos:
	protected float peso;
	protected int idade;
	protected int membros;
	
//	Métodos abstratos de animais (apenas as filhas irão desenvolver):
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

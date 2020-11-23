package projeto9b;

public class Pessoa {
	
	private String nome, sexo;
	private int idade;
	
//	M�todos especiais: Controlador
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
//	M�todos personalizados:
	public void fazerAniver() {
		this.idade++;
	}
	
//	Privando os GETTERS and SETTERS, torna-se mais r�gido o encapsulamento, 
//	podendo acessar apenas os m�todos personalizados sobrescritos da interface controlador.
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}

package relacionamentosentreclasses;

public class Lutador {
	
//	ATRIBUTOS:
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
//	GETTERS AND SETTERS:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso <52.2) {
			this.categoria = "Inv�lido";
		}else if(this.peso <=70.3) {
			this.categoria = "Leve";
		}else if(this.peso <=83.9) {
			this.categoria = "M�dio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inv�lido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	
//	MOSTRAR COISAS NA TELA: M�TODOS P�BLICOS:
	public void apresentar() {
		System.out.println("=======================================================");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + getIdade() + " anos e " + this.getAltura());
		System.out.println("pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " vit�rias!");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates!");
	}

	public void status() {
		System.out.println(this.getNome() + " � um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes.");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
//		this.vitorias = this.vitorias+1;
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}

	
//		M�TODOS ESPECIAIS:
	public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura,
			float peso) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		this.setPeso(peso);
	}
}

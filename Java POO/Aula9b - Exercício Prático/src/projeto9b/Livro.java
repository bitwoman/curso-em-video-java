package projeto9b;

public class Livro implements Publicacao {
//	Atributos:
	private String titulo, autor;
	private int totalPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
//	Métodos especiais: Controlador
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
//	Métodos personalizados:
	public String detalhes() {
		return "Livro [titulo = " + titulo + ", autor = " + autor + ", totalPaginas = " + totalPaginas + ", pagAtual = "
				+ pagAtual + ", aberto = " + aberto + ", leitor = " + leitor.getNome() + ", idade = " + leitor.getIdade() + "]"; 
	}
	
	
//	Privando os GETTERS and SETTERS, torna-se mais rígido o encapsulamento, 
//	podendo acessar apenas os métodos personalizados sobrescritos da interface controlador.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean getAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

//	MÉTODOS ABSTRATOS:
//	Override -> desconsiderando a programação que não foi feita
//	e vou programar cada um deles.
	
	@Override
	public void abrir() {
		if(this.getAberto() == false) {
			System.out.println("Livro estava fechado.");
			this.aberto = true;
			System.out.println("Abrindo livro...");
		}else {
			System.out.println("Livro já está aberto.");
		}
	}

	@Override
	public void fechar() {
		if(this.getAberto() == true) {
			System.out.println("Livro está aberto.");
			this.aberto = false;
			System.out.println("Fechando livro...");
		}
	}

	@Override
	public void folhear(int pagina) {
		if(pagina > this.totalPaginas) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = pagina;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}

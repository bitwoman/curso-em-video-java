
public class Video implements AcoesVideo{
//	Atributos:
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;
	
//	toString:
	@Override
	public String toString() {
		return "Video [titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " + views + ", curtidas = " + curtidas
				+ ", reproduzindo = " + reproduzindo + "]";
	}
	
//	Construtor:
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	//	Getters and Setters:
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
//		Média de avaliações que ele tem:
		nova = this.avaliacao + avaliacao/this.views;
		this.avaliacao = nova;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
//	Métodos sobrescritos da interface:
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}
}

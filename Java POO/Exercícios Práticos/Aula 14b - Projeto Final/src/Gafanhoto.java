
public class Gafanhoto extends Pessoa {
//	Atributos:
	private String login;
	private float totAssistido;
	
//	toString:
	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin =" + login + ", totAssistido=" + totAssistido + "]";
	}
	
//	Construtor:
	public Gafanhoto(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}

	//	Getters and Setters:
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public float getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(float totAssistido) {
		this.totAssistido = totAssistido;
	}

//	Métodos Personalizados:
	public void viuMaisUm() {
		totAssistido += 1;
	}
}

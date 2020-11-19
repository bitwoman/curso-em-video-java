package relacionamentosentreclasses;

import java.util.Random;

public class Luta {
//	ATRIBUTOS:
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
//	MÉTODOS PÚBLICOS:
	public void marcarLuta(Lutador l1, Lutador l2){
//		l1.getCategoria() == l2.getCategoria
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
//	UTILIZAR CLASSE RANDOM:
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //0 1 2
			
			System.out.println("===========RESULTADO DA LUTA===========");
			
			switch(vencedor){
				case 0: //empate
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //Desafiado vence
					System.out.println("Desafiado venceu! Parabéns " + this.desafiado.getNome() + "!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //Desafiante vence
					System.out.println("Desafiante venceu! Parabéns " + this.desafiante.getNome() + "!");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
		}else {
			System.out.println("A LUTA NÃO PODE ACONTECER!");
		}
		
		System.out.println("===========RESULTADO DA LUTA===========");
	}

//	GETTERS AND SETTERS: Métodos especiais:
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
}

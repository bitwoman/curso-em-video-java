package banco;

public class ContaBanco {
		
//	ATRIBUTOS:
	public int numConta;
	private float saldoConta;
	private String donoConta; 
	protected String tipoConta; //tipoConta: cc, cp 
	private boolean statusConta;
	
//	MÉTODOS ESPECIAIS:
//	CONSTRUTOR CONTA:
	public ContaBanco() {
		this.saldoConta = 0;
		this.statusConta = false;
	}
	
//	GETTERS AND SETTERS: Métodos Acessores e Métodos Modificadores:
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public float getSaldoConta() {
		return saldoConta;
	}
	
	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	public String getDonoConta() {
		return donoConta;
	}
	
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	public boolean getStatusConta() {
		return statusConta;
	}
	
	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
//	MÉTODOS PERSONALIZADOS DA CLASSE CONTA:
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatusConta(true);
		
		if(tipoConta == "CC") {
//			a preferência é por equals().
			this.setSaldoConta(50);
			System.out.println("Conta corrente aberta com sucesso!");
		}else if(tipoConta == "CP"){
			this.setSaldoConta(150);
			System.out.println("Conta poupança aberta com sucesso!");
		}
	}
	
	public void fecharConta() {
		if(saldoConta > 0) {
			System.out.println("Ainda há dinheiro.");
		}else if(this.getSaldoConta()<0){
			System.out.println("Há débito pendente...");
		}else {
			this.setStatusConta(false);
			System.out.println("Conta fechada.");
		}
	}
	
	public void depositarConta(float valor) {
		if(this.getStatusConta()) {
			this.setSaldoConta(this.getSaldoConta() + valor);
			System.out.println("Depósito feito na conta de " + this.getDonoConta());
		}else {
			System.out.println("Impossível depositar numa conta fechada!");
		}
	}
	
	public void sacarConta(float valor) {
		if(this.getStatusConta()) {
			if(this.getSaldoConta() >= valor) {
				this.setSaldoConta(this.getSaldoConta() - valor);
				System.out.println("Saque realizado na conta de " + this.getDonoConta());
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int valor=0; //variável local
		
		if(this.getTipoConta() == "CC") {
			valor = 12;
		}else if(this.getTipoConta() == "CP"){
			valor = 20;
		}
		
		if(this.getStatusConta()) {
			this.setSaldoConta(this.getSaldoConta() - valor);
			System.out.println("Mensalidade paga por " + this.getDonoConta());
		}else {
			System.out.println("Ímpossível pagar uma conta fechada.");
		}
	}
	
	public void estadoAtual() {
		System.out.println("\n================================\n");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getDonoConta());
		System.out.println("Saldo: " + this.getSaldoConta());
		System.out.println("Status: " + this.getStatusConta());
	}
}

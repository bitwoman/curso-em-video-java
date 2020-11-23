package banco;

public class Main {

	public static void main(String[] args) {
//		CONTA 1:
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(0001);
		p1.setDonoConta("Brenda");
		p1.abrirConta("CC");
		
//		CONTA 2:
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(0002);
		p2.setDonoConta("Nathalia");
		p2.abrirConta("CP");
		
//		AÇÕES:
		p1.depositarConta(100);
		p2.depositarConta(500);
		
		p2.sacarConta(100);
		
		p1.sacarConta(150);
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
	}
}

package javapoo;

public class Caneta {
	
//	A classe e/ou seus membros s�o acess�veis somente por classes do mesmo pacote, 
//	na sua declara��o n�o � definido nenhum tipo de modificador, sendo este 
//	identificado pelo compilador.
	
//		ATRIBUTOS:
		public String modelo, cor;
		private float ponta; 
		protected int carga;
		private boolean tampada;
		
//		M�TODO CONSTRUTOR:
		public Caneta(String m, String c, float p) {
			this.modelo = m;
			this.cor = c;
			this.ponta = p; //ou this.setPonta(p);
			this.tampar();
		}
		
		
//		GETTERS AND SETTERS: M�todos acessores e m�todos modificadores.
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getPonta() {
			return ponta;
		}

		public void setPonta(float ponta) {
			this.ponta = ponta;
		}

		public int getCarga() {
			return carga;
		}

		public void setCarga(int carga) {
			this.carga = carga;
		}

		public boolean isTampada() {
			return tampada;
		}

		public void setTampada(boolean tampada) {
			this.tampada = tampada;
		}

		
		public void status() {
			System.out.println("Uma caneta " + this.cor);
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Est� tampada? " + this.tampada);
			System.out.println("Carga: " + this.carga);
			System.out.println("Ponta: " + this.ponta);
		}
		
		public void rabiscar() {
			if(this.tampada == true) {
				System.out.println("ERRO");
			}else {
				System.out.println("Rabiscando");
			}
		}
			
//		Os m�todos s�o acessores, e podem acessar os atributos privados atrav�s destes m�todos.
//		O m�todo tampar � p�blico e pode mexer no atributo privado, pois faz parte da mesma classe.
		
		public void tampar(){
			//this -> c1/c2 -> objeto que fez a chamada.
			this.tampada = true;
		}
		
		public void destampar() {
			//this -> c1/c2 -> objeto que fez a chamada.
			this.tampada = false;
		}
}
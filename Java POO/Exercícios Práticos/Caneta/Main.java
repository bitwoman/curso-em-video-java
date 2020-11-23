package javapoo;

public class Main {

	public static void main(String[] args) {
		
//		PRIMEIRO OBJETO:
		System.out.println("PRIMEIRA INSTÂNCIA DE CANETA: \n");
		Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
		c1.status();
		
//		SEGUNDO OBJETO:
		Caneta c2 = new Caneta("NIC", "Preta", 0.5f);
		c2.status();
		
		
/*		ABSTRAINDO:
		Caneta c1 = new Caneta();
		c1.setCor("Azul");
		c1.setModelo("Big Cristal");
		c1.setPonta(0.5f); //f de float.
		c1.setCarga(80);

		System.out.println("Tenho uma caneta modelo " + c1.getModelo() + 
				", da cor " + c1.getCor() + ", de ponta " + c1.getPonta() + 
				" e com carga de " + c1.getCarga());
		
/*	FUNCIONA DA MESMA MANEIRA acessando diretamente o atributo.	
 * 
 * Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.tampada = true;
		não pode acessar porque é um atributo privado.
		c1.ponta = 0.5f;
		Carga é acessível pois está em modo protegido, ou seja, pode ser acessado pela classe e suas subclasses.
		c1.carga = 80;
		c1.tampar();
		c1.status();
		c1.rabiscar();*/
		
//		SEGUNDO OBJETO:		
		/*Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.modelo = "Hostnet";
		c2.carga = 90;
		c2.destampar();
		c2.status();
		c2.rabiscar();*/
	}
}

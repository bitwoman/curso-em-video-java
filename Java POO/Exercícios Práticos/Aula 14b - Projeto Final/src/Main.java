
public class Main {

	public static void main(String[] args) {
//		Instanciando a classe vídeo:
		Video v[] = new Video[3];
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 02 de POO");
		v[2] = new Video("Aula 03 de POO");
		
//		Instanciando a classe Gafanhoto:
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
		g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");
		
		
		Visualizacao vd[] = new Visualizacao[5];
		vd[0] = new Visualizacao(g[0], v[2]); 
		vd[0].avaliar();
		System.out.println(vd[0].toString());
		
		System.out.println("\n");
		
		vd[1] = new Visualizacao(g[0], v[1]);
		vd[1].avaliar(87.0f);
		System.out.println(vd[1].toString());

		/*System.out.println("VIDEOS:\n---------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("\nGAFANHOTOS:\n---------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());*/
	}
}

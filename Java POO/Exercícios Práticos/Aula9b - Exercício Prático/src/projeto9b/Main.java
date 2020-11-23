package projeto9b;

public class Main {

	public static void main(String[] args) {
		 Pessoa[] pessoas = new Pessoa[2];
		 Livro[] livros = new Livro[3];
		 
		 pessoas[0] = new Pessoa("Brenda", "F", 21);
		 pessoas[1] = new Pessoa("Nathalia", "F", 21);
		
		 livros[0] = new Livro("Viagem ao Centro da Terra", "Julio Verne", 304, pessoas[0]);
		 livros[1] = new Livro("Quem é você, Alasca?", "John Green", 297, pessoas[1]);
		 livros[2] = new Livro("As Vantagens de ser Invisível", "Stephen Chbosky", 221, pessoas[0]);
	
		 
		 for(int i=0; i<3; i++) {
			 System.out.println(livros[i].detalhes());
		 }	
	}
}

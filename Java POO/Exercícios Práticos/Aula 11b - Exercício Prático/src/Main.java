
public class Main {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Maicão");
		v1.setIdade(22);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Brenda");
		a1.setMatricula(0001);
		a1.setCurso("Informática");
		a1.setIdade(21);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Nathalia");
		b1.setIdade(21);
		b1.setSexo("F");
		b1.setMatricula(0002);
		b1.setBolsa(12.5f);
		b1.pagarMensalidade();
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Monalisa");
		t1.setIdade(12);
		t1.setSexo("F");
	}
}

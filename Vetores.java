package cursoemvideo;

public class Vetores {

	public static void main(String[] args) {

		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
				"Set", "Nov", "Dez"};
		
		int total[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int c=0; c<mes.length; c++) {
			System.out.println("O mês de " + mes[c] + " tem " + total[c] + " dias.");
		}
	}
}

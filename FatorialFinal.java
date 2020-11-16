package cursoemvideo;

public class FatorialFinal {
	
	private int numero = 0;
	private int fat = 1;
	private String formula = "";
	
	public void setValor(int n) {
		numero = n;
		int f = 1;
		String s = "";
		
		for(int c=n; c>1; c--) {
			f *= c;
			s += c + " x ";
		}
		
		s += "1 = ";
		fat = f;
		formula = s;
	}
		
	public int getFatorial() {
		return fat;
	}
	
	public String getFormula() {
		return formula;
	}
	
	public static void main(String[] args) {
		
		FatorialFinal f = new FatorialFinal();
		f.setValor(5);
		
		System.out.println(f.getFormula() + "" + f.getFatorial());
	}
}

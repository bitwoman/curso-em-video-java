package CursoEmVideo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTelaDoSistema {

	public static void main(String[] args) {
		 Toolkit tk = Toolkit.getDefaultToolkit();
		 Dimension  d = tk.getScreenSize();
		 
		 System.out.println(d.width + " X " + d.height);
	}
}

package operacoesConjuntos;

import javax.swing.JOptionPane;

public class Aplicacao {
	private static String conjunto;
	public static void main(String[] args) {
		Conjuntos conjuntos = new Conjuntos();
		
		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto A. \n \n ATEN��O - Os elementos devem ser separados por espa�o! \n \n" );
		conjuntos.criarConjunto(conjunto, 1);
		
		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto B. \n \n ATEN��O - Os elementos devem ser separados por espa�o! \n \n" );
		conjuntos.criarConjunto(conjunto, 2);
		
		System.out.println(conjuntos.getConjuntoA().toString() + "\n" + conjuntos.getConjuntoB().toString());
	}
}

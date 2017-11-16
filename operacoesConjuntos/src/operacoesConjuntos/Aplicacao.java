package operacoesConjuntos;

import javax.swing.JOptionPane;

public class Aplicacao {
	private static String conjunto;

	public static void main(String[] args) {
		Conjuntos conjuntos = new Conjuntos();

		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto A. \n \n ATEN��O - Os elementos devem ser separados por espa�o! \n \n");
		conjuntos.criarConjunto(conjunto, 1);

		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto B. \n \n ATEN��O - Os elementos devem ser separados por espa�o! \n \n");
		conjuntos.criarConjunto(conjunto, 2);

		JOptionPane.showMessageDialog(null,
				"Conjunto A = " + conjuntos.getConjuntoA().values() + "\n" + 
				"Conjunto B = "	+ conjuntos.getConjuntoB().values() + "\n \n" + 
				"Quantidade de elementos de acordo com as opera��es:"+ "\n \n" + 
				"A U B = " + conjuntos.calcularUniao(),
				"Opera��es de conjuntos - Quantidade de elementos", JOptionPane.INFORMATION_MESSAGE);
	}
}

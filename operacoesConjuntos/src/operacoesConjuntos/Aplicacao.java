package operacoesConjuntos;

import javax.swing.JOptionPane;

public class Aplicacao {
	private static String conjunto;

	public static void main(String[] args) {
		Conjuntos conjuntos = new Conjuntos();

		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto A. \n \n ATENÇÃO - Os elementos devem ser separados por espaço! \n \n");
		conjuntos.criarConjunto(conjunto, 1);

		conjunto = JOptionPane.showInputDialog(null,
				"Insira os elementos do Conjunto B. \n \n ATENÇÃO - Os elementos devem ser separados por espaço! \n \n");
		conjuntos.criarConjunto(conjunto, 2);
		
		conjuntos.calcularUniao();
		conjuntos.calcularInterseccao();
		conjuntos.calcularDiferencaSimetrica();
		
		JOptionPane.showMessageDialog(null,
				"Conjunto A = " + conjuntos.getConjuntoA().keySet() + "\n" + 
				"Conjunto B = "	+ conjuntos.getConjuntoB().keySet() + "\n \n" + 
				"Quantidade de elementos de acordo com as operações:" + "\n \n" + 
				"União = " + conjuntos.getUniao().keySet() + "  Quant. elementos: " + conjuntos.getUniao().size() + "\n" + 
				"Intersecção = " + conjuntos.getInterseccao().keySet() + "  Quant. elementos: " + conjuntos.getInterseccao().size() + "\n" + 
				"Diferença Simétrica = " + conjuntos.getDiferencaSimetrica().keySet() + "  Quant. elementos: " + conjuntos.getDiferencaSimetrica().size(),
				"Operações de conjuntos - Quantidade de elementos", JOptionPane.INFORMATION_MESSAGE);	
	}
}

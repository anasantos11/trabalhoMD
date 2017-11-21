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
		conjuntos.calcularDiferenca();
		conjuntos.calcularProdutoCartesiano();
		conjuntos.calcularComplementar();
			
		System.out.println(
				"Conjunto A = " + conjuntos.getConjuntoA() + "\n" + 
				"Conjunto B = "	+ conjuntos.getConjuntoB() + "\n \n" + 
				"Quantidade de elementos de acordo com as operações:" + "\n \n" + 
				"União = " + conjuntos.getUniao() + "  Quant. elementos: " + conjuntos.getUniao().size() + "\n" + 
				"Intersecção = " + conjuntos.getInterseccao() + "  Quant. elementos: " + conjuntos.getInterseccao().size() + "\n" + 
				"Produto Cartesiano = " + conjuntos.getProdutoCartesiano() + "  Quant. elementos: " + conjuntos.getProdutoCartesiano().size()+ "\n" + 
				"Diferença Simétrica = " + conjuntos.getDiferencaSimetrica() + "  Quant. elementos: " + conjuntos.getDiferencaSimetrica().size() + "\n" + 
				"Diferença A - B = " + conjuntos.getDiferenca() + "  Quant. elementos: " + conjuntos.getDiferenca().size() + "\n" + 
				"Complementar = " + conjuntos.getComplementar() + "  Quant. elementos: " + conjuntos.getComplementar().size()
		);
				
	}
}

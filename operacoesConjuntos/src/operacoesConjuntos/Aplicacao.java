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
		conjuntos.calcularPartes();
			
		System.out.println(
				"Conjunto A = " + conjuntos.getConjuntoA() + "\n" + 
				"Conjunto B = "	+ conjuntos.getConjuntoB() + "\n \n" + 
				"Quantidade de elementos de acordo com as operações:" + "\n \n" + 
				"União A U B = " + conjuntos.getUniao() + "  Quant. elementos: " + conjuntos.getUniao().size() + "\n" + 
				"Intersecção A ^ B = " + conjuntos.getInterseccao() + "  Quant. elementos: " + conjuntos.getInterseccao().size() + "\n" + 
				"Produto Cartesiano A x B = " + conjuntos.getProdutoCartesiano() + "  Quant. elementos: " + conjuntos.getProdutoCartesiano().size()+ "\n" + 
				"Diferença Simétrica (A U B) - (A ^ B) = " + conjuntos.getDiferencaSimetrica() + "  Quant. elementos: " + conjuntos.getDiferencaSimetrica().size() + "\n" + 
				"Diferença A - B = " + conjuntos.getDiferenca() + "  Quant. elementos: " + conjuntos.getDiferenca().size() + "\n" + 
				"Complementar Universo - A = " + conjuntos.getComplementar() + "  Quant. elementos: " + conjuntos.getComplementar().size() + "\n" + 
				"Conjunto das Partes A = " + conjuntos.getPartes() + "  Quant. elementos: " + conjuntos.getPartes().size()
		);
				
	}
}

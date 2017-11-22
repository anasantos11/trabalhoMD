package operacoesConjuntos;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;

public class Aplicacao {
	private static String conjunto;
	private static String impressao;

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
			
		impressao = "Conjunto A = " + conjuntos.getConjuntoA() + "\n" + 
				"Conjunto B = "	+ conjuntos.getConjuntoB() + "\n \n" + 
				"Quantidade de elementos de acordo com as operações:" + "\n \n" + 
				"União A U B = " + conjuntos.getUniao() + "  Quant. elementos: " + conjuntos.getUniao().size() + "\n \n" + 
				"Intersecção A ^ B = " + conjuntos.getInterseccao() + "  Quant. elementos: " + conjuntos.getInterseccao().size() + "\n \n" + 
				"Produto Cartesiano A x B = " + conjuntos.getProdutoCartesiano() + "  Quant. elementos: " + conjuntos.getProdutoCartesiano().size()+ "\n \n" + 
				"Diferença Simétrica (A U B) - (A ^ B) = " + conjuntos.getDiferencaSimetrica() + "  Quant. elementos: " + conjuntos.getDiferencaSimetrica().size() + "\n \n" + 
				"Diferença A - B = " + conjuntos.getDiferenca() + "  Quant. elementos: " + conjuntos.getDiferenca().size() + "\n \n" + 
				"Complementar Universo - A = " + conjuntos.getComplementar() + "  Quant. elementos: " + conjuntos.getComplementar().size() + "\n \n" + 
				"Conjunto das Partes A = " + conjuntos.getPartes() + "  Quant. elementos: " + conjuntos.getPartes().size();
		
		
		 JScrollPane scrollpane = new JScrollPane(); 
		 JTextArea list = new JTextArea(30,80);
		 list.setText(impressao);
		 list.setLineWrap(true);
	     scrollpane = new JScrollPane(list);
	     JPanel panel = new JPanel(); 
	     panel.add(scrollpane);
	     scrollpane.getViewport().add(list);
	      JOptionPane.showMessageDialog(null, scrollpane, "Error List",  
	                                              JOptionPane.PLAIN_MESSAGE);
				
	}
}

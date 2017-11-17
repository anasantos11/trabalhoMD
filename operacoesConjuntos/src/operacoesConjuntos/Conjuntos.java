package operacoesConjuntos;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class Conjuntos {
	private List<Character> alfabeto;
	private String par;
	private Map<String, String> conjuntoA;
	private Map<String, String> conjuntoB;
	private Map<String, String> uniao;
	private Map<String, String> interseccao;
	private Map<String, String> diferencaSimetrica;
	private Map<String, String> diferenca;
	private Map<String, String> produtoCartesiano;

	public Conjuntos() {
		this.alfabeto = new ArrayList<Character>();
		this.conjuntoA = new TreeMap<String, String>();
		this.conjuntoB = new TreeMap<String, String>();
		this.uniao = new TreeMap<String, String>();
		this.interseccao = new TreeMap<String, String>();
		this.diferencaSimetrica = new TreeMap<String, String>();
		this.diferenca = new TreeMap<String, String>();
		this.produtoCartesiano = new TreeMap<String, String>();

	}

	public void criarListAlfabeto() {
		for (int i = 65; i <= 90; i++) {
			alfabeto.add((char) i);
		}
		for (int i = 97; i <= 122; i++) {
			alfabeto.add((char) i);
		}
	}

	public void criarConjunto(String conjunto, int tipo) {
		String[] elemento = conjunto.split(" ");
		int tamanho = elemento.length;

		for (int i = 0; i < tamanho; i++) {
			if (tipo == 1) {
				conjuntoA.put(elemento[i], elemento[i]);
			} else {
				conjuntoB.put(elemento[i], elemento[i]);
			}
		}
	}

	public void calcularUniao() {
		uniao.putAll(conjuntoA);
		uniao.putAll(conjuntoB);
	}

	public void calcularInterseccao() {
		for (String a : conjuntoA.keySet()) {
			if (conjuntoB.containsKey(a)) {
				interseccao.put(a, a);
			}
		}
	}

	public void calcularDiferencaSimetrica() {
		for (String a : uniao.keySet()) {
			if (!interseccao.containsKey(a)) {
				diferencaSimetrica.put(a, a);
			}
		}
	}
	
	public void calcularDiferenca() {
		for (String a : conjuntoA.keySet()) {
			if (!conjuntoB.containsKey(a)) {
				diferenca.put(a, a);
			}
		}
	}
	
	public void calcularProdutoCartesiano() {
		for(String a: conjuntoA.keySet()) {
			for(String b : conjuntoB.keySet()) {
				par = "(" + a + "," + b + ")";
				produtoCartesiano.put(par, par);
			}
		}
	}

	public Map<String, String> getConjuntoA() {
		return conjuntoA;
	}

	public Map<String, String> getConjuntoB() {
		return conjuntoB;
	}

	public Map<String, String> getUniao() {
		return uniao;
	}

	public Map<String, String> getInterseccao() {
		return interseccao;
	}

	public Map<String, String> getDiferencaSimetrica() {
		return diferencaSimetrica;
	}

	public Map<String, String> getDiferenca() {
		return diferenca;
	}

	public Map<String, String> getProdutoCartesiano() {
		return produtoCartesiano;
	}
	

}

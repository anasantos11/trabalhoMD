package operacoesConjuntos;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Conjuntos {
	private List<Character> alfabeto;
	private String par;
	private LinkedHashSet<String> conjuntoUniverso;
	private LinkedHashSet<String> conjuntoA;
	private LinkedHashSet<String> conjuntoB;
	private LinkedHashSet<String> uniao;
	private LinkedHashSet<String> interseccao;
	private LinkedHashSet<String> diferencaSimetrica;
	private LinkedHashSet<String> diferenca;
	private LinkedHashSet<String> produtoCartesiano;
	private LinkedHashSet<String> complementar;
	private LinkedHashSet<String> partes;
	
	public Conjuntos() {
		this.alfabeto = new ArrayList<Character>();
		this.conjuntoUniverso = new LinkedHashSet<String>();
		this.conjuntoA = new LinkedHashSet<String>();
		this.conjuntoB = new LinkedHashSet<String>();
		this.uniao = new LinkedHashSet<String>();
		this.interseccao = new LinkedHashSet<String>();
		this.diferencaSimetrica = new LinkedHashSet<String>();
		this.diferenca = new LinkedHashSet<String>();
		this.produtoCartesiano = new LinkedHashSet<String>();
		this.complementar = new LinkedHashSet<String>();
		this.partes = new LinkedHashSet<String>();

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
				conjuntoA.add(elemento[i]);
			} else {
				conjuntoB.add(elemento[i]);
			}
		}
	}

	public void calcularUniao() {
		uniao.addAll(conjuntoA);
		uniao.addAll(conjuntoB);
	}

	public void calcularInterseccao() {
		for (String a : conjuntoA) {
			if (conjuntoB.contains(a)) {
				interseccao.add(a);
			}
		}
	}

	public void calcularDiferencaSimetrica() {
		for (String a : uniao) {
			if (!interseccao.contains(a)) {
				diferencaSimetrica.add(a);
			}
		}
	}

	public void calcularDiferenca() {
		for (String a : conjuntoA) {
			if (!conjuntoB.contains(a)) {
				diferenca.add(a);
			}
		}
	}

	public void calcularProdutoCartesiano() {
		for (String a : conjuntoA) {
			for (String b : conjuntoB) {
				par = "(" + a + "," + b + ")";
				produtoCartesiano.add( par);
			}
		}
	}

	public <E> String parseString(E elemento) {
		return elemento + "";
	}

	public void calcularComplementar() {
		for (int i = 65; i <= 90; i++) {
			conjuntoUniverso.add(parseString((char) i));
		}
		for (int i = 97; i <= 122; i++) {
			conjuntoUniverso.add(parseString((char) i));
		}
		for (int i = -100; i <= 100; i++) {
			conjuntoUniverso.add(parseString(i));
		}
		complementar.addAll(conjuntoUniverso);

		for (String a : conjuntoA) {
			if (complementar.contains(a)) {
				complementar.remove(a);
			}
		}

	}

	public void calcularPartes() {
		LinkedHashSet<String> teste = new LinkedHashSet<String>();
		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.addAll(teste);

		partes.addAll(conjuntoA);
		partes.addAll(produtoCartesiano);

		for (String a : conjuntoA) {
			list.addAll(teste);
		}
	}

	public LinkedHashSet<String> getConjuntoA() {
		return conjuntoA;
	}

	public LinkedHashSet<String> getConjuntoB() {
		return conjuntoB;
	}

	public LinkedHashSet<String> getUniao() {
		return uniao;
	}

	public LinkedHashSet<String> getInterseccao() {
		return interseccao;
	}

	public LinkedHashSet<String> getDiferencaSimetrica() {
		return diferencaSimetrica;
	}

	public LinkedHashSet<String> getDiferenca() {
		return diferenca;
	}

	public LinkedHashSet<String> getProdutoCartesiano() {
		return produtoCartesiano;
	}

	public LinkedHashSet<String> getComplementar() {
		return complementar;
	}

}

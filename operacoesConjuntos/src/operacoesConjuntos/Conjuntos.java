package operacoesConjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjuntos {
	private List<Character> alfabeto;
	private String par;
	private HashSet<String> conjuntoUniverso;
	private HashSet<String> conjuntoA;
	private HashSet<String> conjuntoB;
	private HashSet<String> uniao;
	private HashSet<String> interseccao;
	private HashSet<String> diferencaSimetrica;
	private HashSet<String> diferenca;
	private HashSet<String> produtoCartesiano;
	private HashSet<String> complementar;
	private Set<Set<String>> partes;

	public Conjuntos() {
		this.alfabeto = new ArrayList<Character>();
		this.conjuntoUniverso = new HashSet<String>();
		this.conjuntoA = new HashSet<String>();
		this.conjuntoB = new HashSet<String>();
		this.uniao = new HashSet<String>();
		this.interseccao = new HashSet<String>();
		this.diferencaSimetrica = new HashSet<String>();
		this.diferenca = new HashSet<String>();
		this.produtoCartesiano = new HashSet<String>();
		this.complementar = new HashSet<String>();
		this.partes = new HashSet<Set<String>>();

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
				produtoCartesiano.add(par);
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
		partes = calcularPartes(conjuntoA);
	}

	public Set<Set<String>> calcularPartes(Set<String> originalSet) {
		Set<Set<String>> sets = new HashSet<Set<String>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<String>());
			return sets;
		}

		List<String> list = new ArrayList<String>(originalSet);

		String head = list.get(0);
		Set<String> rest = new HashSet<String>(list.subList(1, list.size()));
		for (Set<String> set : calcularPartes(rest)) {
			Set<String> newSet = new HashSet<String>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

	public HashSet<String> conjuntoDasPartes() {
		HashSet<String> conjuntoPartes = new HashSet<String>();

		final int tamanho = conjuntoA.size();

		for (int i = 0; i < (1 << tamanho); i++) {
			StringBuilder sb = new StringBuilder("{");

			for (int j = 0; j < tamanho; j++)
				if ((i & (1 << j)) > 0)
					sb.append(conjuntoA.toArray()[j] + ",");

			sb.append("}");
			conjuntoPartes.add(sb.toString().replace(",}", "}"));
		}

		return conjuntoPartes;
	}

	public HashSet<String> getConjuntoA() {
		return conjuntoA;
	}

	public HashSet<String> getConjuntoB() {
		return conjuntoB;
	}

	public HashSet<String> getUniao() {
		return uniao;
	}

	public HashSet<String> getInterseccao() {
		return interseccao;
	}

	public HashSet<String> getDiferencaSimetrica() {
		return diferencaSimetrica;
	}

	public HashSet<String> getDiferenca() {
		return diferenca;
	}

	public HashSet<String> getProdutoCartesiano() {
		return produtoCartesiano;
	}

	public HashSet<String> getComplementar() {
		return complementar;
	}

	public Set<Set<String>> getPartes() {
		return partes;
	}

}

package operacoesConjuntos;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class Conjuntos {
	private List<Character> alfabeto;
	private Map<String, String> conjuntoA;
	private Map<String, String> conjuntoB;

	public Conjuntos() {
		this.alfabeto = new ArrayList<Character>();
		this.conjuntoA = new TreeMap<String, String>();
		this.conjuntoB = new TreeMap<String, String>();
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
		
		for(int i = 0; i < tamanho; i++) {
			if(tipo == 1) {
				conjuntoA.put(elemento[i], elemento[i]);
			}else {
				conjuntoB.put(elemento[i], elemento[i]);
			}
		}
	}
	
	public int calcularUniao() {
		Map<String, String> uniao = new TreeMap<String, String>();
		uniao.putAll(conjuntoA);
		uniao.putAll(conjuntoB);
		return uniao.size();
	}
	public int calcularInterseccao() {
		int cont = 0;
		for(String a: conjuntoA.keySet()) {
			if(conjuntoB.containsKey(a)) {
				cont++;
			}
		}
		return cont;
	}
	
	public Map<String, String> getConjuntoA() {
		return conjuntoA;
	}

	public Map<String, String> getConjuntoB() {
		return conjuntoB;
	}
	
	

}

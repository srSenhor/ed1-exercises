package list1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class q41 {

	public static void main(String[] args) {
		//Listas guardam elementos que podem ser acessados na ordem em que foram adicionados.
		
		List<Pessoa> lista1 = new ArrayList<Pessoa>();	// Mais comum, de uso geral e similar a um array. Maior consumo de memória por clonar seus elementos quando a capacidade chega ao máximo.
		List<Pessoa> lista2 = new Vector<Pessoa>();		// Similar ao Arraylist, mas é thread-safe e a capacidade expande mais. Há também o stack, que extende de Vector e tem comportamento de pilha.
		List<Pessoa> lista3 = new LinkedList<Pessoa>();	// Uma lista encadeada, cada elemento possui uma referência para o elemento posterior e outra pra o posterior. Seus elementos não estão necessariamente sequenciais no mesmo bloco de memória.
		
		lista1.add(new Pessoa("123213415", "Saulo", 1.45, 56.3));
		lista1.add(new Pessoa("123445523", "Paulo", 1.12, 56.3));
		lista1.add(new Pessoa("123213123", "Mauro", 1.65, 52.3));
		
		lista1.set(0, new Pessoa("45345545", "cmon baby do it", 1.56, 76.4));
		for(Pessoa p : lista1) {
			System.out.println(p);
		}
		
		//Sets dispoem seus elementos de maneira que pode haver apenas um elemento com o mesmo identificador.
		Set<Pessoa> conj1 = new HashSet<Pessoa>();		// Usa da tabela Hash pra sua construção. Eficiente e seus elementos não são ordenados. Possui um par de informações: <valor, chave>. 
		Set<Pessoa> conj2 = new TreeSet<Pessoa>();		// Apresenta estrutura de árvore, orden automaticamente seus elementos baseando no critério de cada elemento.
		Set<Pessoa> conj3 = new LinkedHashSet<Pessoa>();// Mamtém eficiencia do HashSet e ainda mantém a ordem em que os elemntos foram insertos.
		
		//Queues permitem apenas a entrada e saída de objetos de sua estrutura nas pontas, ou seja, quem entra fica no fim, e quem sai está sempre no começo. Permite elementos com a mesma chave.
		Queue<Pessoa> fila1 = new LinkedList<Pessoa>();		// Conserva ordem de inserção e implementa internamente uma lista duplamente encadeada, além de aceitar elementos do tipo null. 
		Queue<Pessoa> fila2 = new PriorityQueue<Pessoa>();	// Não aceita elementos null e ordena de acordo com os critérios da estrutura padrão.  
		
		//Deque permitem manipular o fim e o início da fila
		Deque<Pessoa> defila = new LinkedList<Pessoa>();	//Implementa uma lista duplamente encadeada por dentro. Conserva ordem de inserção.
		
		//Maps possui como identificador um par <chave, valor>, e não podem haver elementos com a mesma chave
		Map<Integer, Pessoa> mapa1 = new HashMap<Integer, Pessoa>();		// Eficiente. Permite apenas uma chave null e não é ordenada (se baseia pela chave).
		Map<Integer, Pessoa> mapa2 = new LinkedHashMap<Integer, Pessoa>();	// Igual ao HashMap, mas ordena pela ordem de inserção. 
		Map<Integer, Pessoa> mapa3 = new TreeMap<Integer, Pessoa>();		// Não permite chave null, menos eficiente que as anteriores e os elementos são ordenados.
	}

}

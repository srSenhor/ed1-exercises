package list2.q6;

import list2.q3.ListaEncadeada;
import list2.q3.ListaEncadeadaSimples;

public class Pilha <E> {

	ListaEncadeada<E> pilha = new ListaEncadeadaSimples<E>();

	public void push(E element) {
		if(pilha.isEmpty()) {
			pilha.addFirst(element);			
		} else {
			pilha.addLast(element);			
		}
	}
	
	public E pop() {
		return pilha.removeFirst();			
	}

	public void show() {
		pilha.show();			
	}
	
	public E peek() {
		return pilha.peekLast();			
	}
	
}

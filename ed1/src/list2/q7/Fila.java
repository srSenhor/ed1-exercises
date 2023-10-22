package list2.q7;

import list2.q3.ListaEncadeada;
import list2.q4.ListaEncadeadaDupla;

public class Fila <E>{
	ListaEncadeada<E> fila = new ListaEncadeadaDupla<E>();
	
	public void add(E element) {
		fila.addLast(element);
	}
	
	public E remove() {
		return fila.removeFirst();
	}
	
	public E peek() {
		return fila.peekLast();
	}
	
	public void show() {
		fila.show();
	}
}

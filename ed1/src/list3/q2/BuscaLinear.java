package list3.q2;

import list2.q3.ListaEncadeada;
import list2.q4.ListaEncadeadaDupla;

public class BuscaLinear{
	public static void main(String [] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeadaDupla<Integer>();
		lista.addLast(3);
		lista.addLast(5);
		lista.addLast(2);
		lista.addLast(65);
		
		int procurado = 5;
		
		lista.search(procurado);
	}
}

package list2.q4;

import list2.q3.ListaEncadeada;

public class ListaEncadeadaDupla<E> implements ListaEncadeada<E>{

	class Node {
		E data;
		Node ante, prox;
		int position;
		
		public Node(E data) {
			this.data = data;
			this.ante = null;
			this.prox = null;
			this.position = -1;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public ListaEncadeadaDupla() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	@Override
	public void addFirst(E element) {
		Node novo = new Node(element);
		
		if(head == null) {
			head = tail = novo;
		} else {
			novo.prox = head;
			head.ante = novo;
			head = novo;
		}
		
		this.size++;
	}

	@Override
	public void addLast(E element) {
		Node novo = new Node(element);
		
		if(head == null) {
			head = tail = novo;
		} else {
			novo.ante = tail;
			tail.prox = novo;
			tail = novo;
		}
		
		this.size++;
	}

	@Override
	public E removeFirst() {
		Node removido = head;
		E dadoRemovido;
		
		if(head == null) {
			System.out.println("Lista vazia.");
			return null;
		} else {
			
			dadoRemovido = head.data;
			
			if(head == tail) {
				System.out.println("Removendo o unico elemento da lista.");
				head = tail = null;
			} else {
				/* 	Nessa ordem fica menos legível, mas ainda funcional
				head.prox.ante = null;	// O segundo elemento da lista tem o ponteiro pro anterior nulificado
				head = head.prox;		// O segundo elemento se torna o novo primeiro elemento (head)
				*/
				head = head.prox;		// O segundo elemento se torna o novo primeiro elemento (head)
				head.ante = null;	// O segundo elemento da lista tem o ponteiro pro anterior nulificado
			}
			removido.prox = null;		// Apaga a referencia do antigo primeiro elemento (head) para o novo primeiro elemento (o novo head)
			this.size--;
		}
		
		return dadoRemovido;
	}

	@Override
	public E removeLast() {
		//Node removido = tail;
		E dadoRemovido;
		
		if(head == null) {
			System.out.println("Lista vazia.");
			return null;
		} else {
			
			dadoRemovido = tail.data;
			
			if(head == tail) {
				System.out.println("Removendo o unico elemento da lista.");
				head = tail = null;
			} else {
				/* 	Nessa ordem fica menos legível, mas precisa testar se funciona
				tail.ante.prox = null;	// O penultimo elemento da lista tem o ponteiro pro posterior nulificado
				tail = tail.ante;		// O penultimo elemento se torna o novo ultimo elemento (tail)
				*/
				
				Node anterior = tail.ante;
				tail.ante = null;
				tail = anterior;
				tail.prox = null;
				
			}
			this.size--;
		}	
		return dadoRemovido;
	}
	
	@Override
	public E remove(E element) {
		E dadoRemovido = null;
		if(head == null) {
			System.out.println("Lista vazia.");
		} else {
			Node anterior = null;
			Node removido = searchNode(element);
			
			if(removido != null) {
				anterior = removido.ante;
			}
			
			if(anterior == null) {
				if(head.data.equals(element) == false) {
					System.out.println("Elemento nao existe.");
					return null;
				} else {
					return removeFirst();
				}
			} else {
				if(removido == tail) {
					return removeLast();
				} else {
					
					Node posterior = removido.prox;
					
					posterior.ante = anterior;
					anterior.prox = posterior;
					removido.prox = removido.ante = null;

					this.size--;
					
					dadoRemovido = removido.data;
				}
			}			
		}
		return dadoRemovido;					
	}

	@Override
	public E peekFirst() {
		if(size == 0) {
			System.out.println("Lista vazia.");
			return null;
		}
		return head.data;
	}

	@Override
	public E peekLast() {
		if(size == 0) {
			System.out.println("Lista vazia.");
			return null;
		}
		return tail.data;	
	}

	private Node searchNode(E element) {
		Node n = head;
		int pos = 0;
		
		while(n != null) {
			n.position = pos;
			if(n.data.equals(element)) return n;
			pos++;
			n = n.prox;
		}
		return null;
	}
	
	@Override
	public boolean search(E element) {
		Node result = searchNode(element);
		if(result == null) {
			System.out.println("Elemento não foi encontrado.");
			return false;
		}
		System.out.println("Posição do elemento: " + result.position);
		return true;
	}

	@Override
	public void show() {
		Node n = head;
		int i = 1;
		if(n == null) {
			System.out.println("Lista vazia.");
		} else {
			while(n != null) {
				System.out.println("Elemento " + i + ":" + n.data);
				i++;
				n = n.prox;
			}
		}
		System.out.println("Tamanho: " + size + "\n");
	}
	
	public boolean isEmpty() {
		if(head == null && tail == null) return true; 
		return false;
	}
}

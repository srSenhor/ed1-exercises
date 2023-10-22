package list2.q3;

public class ListaEncadeadaSimples <E> implements ListaEncadeada<E>{
	
	class Node {
		E data;
		int qtd;
		Node prox;
		
		public Node(E data) {
			this.data = data;
			this.prox = null;
			this.qtd = 1;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public ListaEncadeadaSimples() {
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
			//Tem alguma diferença se eu inverter a ordem abaixo? Verifica ai
			
			novo.prox = head;
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
			tail.prox = novo;
			tail = novo;
		}
		
		this.size++;
	}
	
	@Override
	public E removeFirst() {
		Node n = head;
		E element = null;
		
		if(head == null) {
			System.out.println("Nenhum elemento na lista");
		} else {
			
			element = head.data;
			
			if(head == tail) {
				head = null;
				tail = null;
			} else {			
				head = head.prox; 
			}
			
			n.prox = null;
			this.size--;
		}
		return element;
	}

	@Override
	public E removeLast() {
		E element = null;
		
		if(tail == null) {
			System.out.println("Nenhum elemento na lista");
			return null;
		} else {
			
			element = tail.data;
			
			if(head == tail) {
				head = null;
				tail = null;
			} else {			
				Node penultimo = head;
				
				while(penultimo.prox != tail) {
					penultimo = penultimo.prox;
				}
				
				tail = penultimo;
				tail.prox = null;
			}
			
			this.size--;
		}
		return element;
	}
	
	@Override
	public E remove(E element) {
		System.out.println("Por ora, isso não faz nada ;)");
		return null;
	}


	@Override
	public E peekFirst() {
		if(size == 0) return null;
		return head.data;
	}

	@Override
	public E peekLast() {
		if(size == 0) return null;
		return tail.data;
	}

	private Node searchNode(E element) {
		Node n = head;

		while(n != null) {
			if(n.data.equals(element)) return n;
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
		return true;
	}

	@Override
	public void show() {
		Node n = head;
		if(n == null) {
			System.out.println("Lista Vazia");
		} else {
			while(n != null) {
				System.out.println("Elemento: " + n.data);
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

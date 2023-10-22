package list2.q2;

public class ListaVetor<E> implements ListaVetorInterface<E>{
	
	private int size;
	private int inicio;
	private int fim;
	private Object[] lista;
	
	public ListaVetor(int size) {
		this.inicio = this.fim = -1;
		this.size = size;
		lista = new Object[size];
	}
	
	@Override
	public void add(E item) {
		
		int lastTemp = (fim + 1) % size; 
		
		if(inicio == lastTemp) {
			System.out.println("Fila cheia");
		}
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}

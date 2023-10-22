package list2.q1;

public class PilhaVetor <E> implements PilhaVetorInterface<E>{
	
	private Object[] elements;
	private int maxTam;
	private int size;
	
	public PilhaVetor() {
		this.maxTam = 50;
		this.size = -1;
		elements = new Object[maxTam];
	}
	
	public PilhaVetor(int maxTam) {
		this.maxTam = maxTam;
		this.size = -1;
		elements = new Object[maxTam];
	}
	
	@Override
	public void push(E element) {
		this.size++;
		elements[size] = (Object) element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		Object element = elements[size];
		elements[size] = null;
		
		this.size--;
		
		return (E) element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		return (E) elements[size];
	}

	@Override
	public int size() {
		return this.size + 1;
	}

	@Override
	public void show() {
		if(size == maxTam) {
			for(Object obj : elements) {
				System.out.println("Elemento: " + obj);
			}
		} else {
			for(int i = 0; i <= size; i++) {
				System.out.println("Elemento: " + elements[i]);
			}
		}
	}

}

package list2.q2;

public interface ListaVetorInterface<E> {
	void add(E item);
	E remove();
	
	E peek();
	
	boolean isEmpty();
	boolean isFull();
	
	void show();

}

package list2.q3;

public interface ListaEncadeada <E> {
	public void addFirst(E element);
	public void addLast(E element);
	
	public E removeFirst();
	public E removeLast();
	public E remove(E element);
	
	public E peekFirst();
	public E peekLast();
	
	public boolean search(E element);
	public void show();
	public boolean isEmpty();
}

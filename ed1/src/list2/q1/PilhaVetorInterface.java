package list2.q1;

public interface PilhaVetorInterface <E> {
	
	void push(E element);
	E pop();
	E peek();
	
	int size();
	void show();
}

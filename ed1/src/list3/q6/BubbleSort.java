package list3.q6;

public class BubbleSort {
	public static void main(String [] args) {
		int [] vet = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		
		for(int i = 0; i < vet.length; i++) {
			for(int j = 0; j < vet.length - 1; j++) {
				if(vet[j] > vet[j + 1]) {
					int temp = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = temp;
				}
			}
		}
		System.out.println("Vetor ordenado:");
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}
}

package list3.q8;

public class SelectSort {
	public static void main(String [] args) {
		int [] vet = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		
		for(int i = 0; i < vet.length; i++) {
			int menor = i; 
			for(int j = i; j < vet.length; j++) {
				menor = (vet[j] <= vet[menor])? j : menor;
			}
			int aux = vet[i];
			vet[i] = vet[menor];
			vet[menor] = aux;
		}
		System.out.println("Vetor ordenado:");
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}
}

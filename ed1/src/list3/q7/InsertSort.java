	package list3.q7;

public class InsertSort {
	public static void main(String [] args) {
		int [] vet = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		
		for(int i = 1; i < vet.length; i++) {
			int j = i, aux = vet[j]; //vet[j] = 1, j = 5
			boolean cond = true;
			
			while(j > 0 && cond) { //j == 0, cond == true
				if(aux < vet[j - 1]) { // [2, 2, 3, 5, 23, 65]
					vet[j] = vet[j - 1];
					j--;
				} else {
					cond = false;
				}
			}
			vet[j] = aux;
		}
		System.out.println("Vetor ordenado:");
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}

}

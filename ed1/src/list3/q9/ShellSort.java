package list3.q9;

public class ShellSort {
	public static void main(String [] args) {
		int [] vet = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		int h = 1;
		
		while(h < vet.length) {
			h = 3 * h + 1;
		}
		while(h > 1) {
			h = h / 3;
			for(int i = h; i < vet.length; i++) {
				
				int j = i - h, aux = vet[i]; //vet[j] = 1, j = 5
				
				while(j >= 0 && aux < vet[j]) { //j == 0, cond == true
					vet[j + h] = vet[j];
					j = j - h;
				}
				vet[j + h] = aux;
			}	
		}
		
		System.out.println("Vetor ordenado:");
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}
}


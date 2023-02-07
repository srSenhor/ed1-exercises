package list1;

public class q28 {
	private static int vet[] = {2,5,6,4,8,5,23,7,4,2}; 
	public static void main(String[] args) {
		
		int maior = vet[0], menor = vet[0];
		
		// ==============================================
		System.out.println("Vetor: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.println("vet[" + i + "] = " + vet[i]);
			if(maior < vet[i]) {
				maior = vet[i];
			}
			if(menor > vet[i]) {
				menor = vet[i];
			}
		}
		System.out.println();
		// ==============================================
		
		System.out.println("Maior numero do vetor: " + maior);
		System.out.println("Menor numero do vetor: " + menor);
		
	}
}

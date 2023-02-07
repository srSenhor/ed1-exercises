package list1;

public class q27 {
	private static int vet[] = {1, 2, 3, 4, 5}; 
	public static void main(String[] args) {
		
		// ==============================================
		System.out.println("Vetor: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.println("vet[" + i + "] = " + vet[i]);
		}
		System.out.println();
		// ==============================================
		inverteVetor(vet);
		
		System.out.println("Vetor invertido");
		for(int i = 0; i < vet.length; i++) {
			System.out.println("vet[" + i + "] = " + vet[i]);
		}
		System.out.println();		 
	}
	
	public static void inverteVetor(int vet[]) {
		int tam = vet.length - 1;
		System.out.println(tam);
		
		int novovet[] = new int[tam];
		for(int i = 0; i < vet.length; i++, tam--) {
			novovet[i] = vet[tam];
		}
		vet = novovet;
	}
	

}

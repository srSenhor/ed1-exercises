package list1;

import java.util.Scanner;

public class q25 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Defina o tamanho do vetor: ");
		int tam = cin.nextInt();
		
		int vet[] = new int[tam];
		
		// ==============================================
		System.out.println("Preencha o vetor");
		for(int i = 0; i < tam; i++) {
			System.out.print("Entre com um inteiro: ");
			vet[i] = cin.nextInt();
		}
		System.out.println();
		// ==============================================
		System.out.println("Exibindo o vetor");
		for(int i = 0; i < tam; i++) {
			System.out.println("vet[" + i + "] = " + vet[i]);
		}		 
	}
}

package list1;

import java.util.Scanner;

public class q26 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Defina o tamanho da matriz");
		
		System.out.print("i: ");
		int i = cin.nextInt();
		
		System.out.print("j: ");
		int j = cin.nextInt();
		
		int mat[][] = new int[i][j];
		
		// ==============================================
		System.out.println("Preencha a matriz");
		for(int a = 0; a < i; a++) {
			for(int b = 0; b < j; b++) {
				System.out.print("Entre com um inteiro: ");
				mat[a][b] = cin.nextInt();
			}
		}
		System.out.println();
		// ==============================================
		System.out.println("Exibindo o vetor");
		for(int a = 0; a < i; a++) {
			for(int b = 0; b < j; b++) {
				System.out.println("mat[" + a + "][" + b + "] = " + mat[a][b]);
			}
		}
	}
}

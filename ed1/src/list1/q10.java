package list1;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		
		System.out.print("Entre com um inteiro: ");
		int n1 = cin.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.print(n1 + " é par.");
		}else {
			System.out.print(n1 + " é impar. ");
		}
	}

}

package list1;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		int num = cin.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Três");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Valor invalido.");
		}
	}

}

package list1;

import java.util.Scanner;

public class q36 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Entre com um inteiro: ");
		int x = cin.nextInt();
		
		x = fat(x);
		System.out.print("Fatorial: " + x);
		
	}
	
	public static int fat(int x) {
		int result = 0;
		
		if(x == 1 || x == 0) {
			result = 1;
		}else {
			result = x * fat(x - 1); 
		}
		
		return result;
	}
}

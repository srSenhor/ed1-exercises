package list1;

import java.util.Scanner;

public class q19 {

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int num = cin.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i + " x " + num + " = " + (num * i));
		}
	}
}
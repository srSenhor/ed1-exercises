package list1;

import java.util.Scanner;

public class q03 
{		
	public static void main(String[] args)
	{
		// ===========================================
		Scanner cin = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int num0 = cin.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		int num1 = cin.nextInt();
		
		// ===========================================
		
		System.out.println("\n\n\n\n\n");
		
		System.out.println(num0 + " + " + num1 + " = " + (num0 + num1));
		System.out.println(num0 + " - " + num1 + " = " + (num0 - num1));
		System.out.println(num0 + " * " + num1 + " = " + (num0 * num1));
		System.out.println(num0 + " / " + num1 + " = " + (num0 / num1));
		System.out.println(num0 + " % " + num1 + " = " + (num0 % num1));
		
		cin.close();
	}
}

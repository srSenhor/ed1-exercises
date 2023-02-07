package list1;

import java.util.Scanner;

public class q04 
{
	public static void main(String[] args)
	{
		// ===========================================
		Scanner cin = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int num0 = cin.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		int num1 = cin.nextInt();
		
		System.out.print("Digite outro inteiro de novo: ");
		int num2 = cin.nextInt();
		
		// ===========================================
		
		System.out.println("Media aritmetica dos inteiros: " + ((num0 + num1 + num2)/3));
		
		cin.close();
	}
}

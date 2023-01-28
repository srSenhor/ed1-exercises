package list1;

import java.util.Scanner;

public class q5
{
	public static void main(String[] args)
	{
		// ===========================================
		Scanner cin = new Scanner(System.in);

		System.out.print("Digite um numero real: ");
		double num0 = cin.nextDouble();
		
		System.out.print("Digite outro numero real: ");
		double num1 = cin.nextDouble();
		
		System.out.print("Digite outro numero real de novo: ");
		double num2 = cin.nextDouble();
		
		// ===========================================
		
		System.out.println("Media aritmetica dos inteiros: " + ((num0 + num1 + num2)/3.0));
		
		cin.close();
	}

}

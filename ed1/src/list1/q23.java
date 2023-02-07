package list1;

import java.util.Scanner;

public class q23 {

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		int num = cin.nextInt();
		
		//Solução b): Usando o laço do-while		
		
		double fatorial = fat(num);
		System.out.println("Fatorial: " + fatorial);	
	}
	
	public static double fat(double n0)
	{
		double fatorial = n0;
		
		for(double i = (n0 - 1); i > 1; i--)
		{
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}

}

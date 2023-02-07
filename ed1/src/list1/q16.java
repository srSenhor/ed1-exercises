package list1;

import java.util.Scanner;

public class q16 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Informe o limite inferior: ");
		int x0 = cin.nextInt();
		
		System.out.print("Informe o limite superior: ");
		int xn = cin.nextInt();
		
		//Solução a): Usando o laço while
		int aux = x0;
		
		System.out.print("Solução while: [ ");
		while(aux <= xn) 
		{
			System.out.print(aux + " ");
			aux++;
		}
		System.out.println("]");
		
		
		//Solução b): Usando o laço do-while
		aux = x0;
		
		System.out.print("Solução do-while: [ ");
		do 
		{
			System.out.print(aux + " ");
			aux++;
		}while(aux <= xn);
		
		System.out.println("]");

		
		//Solução b): Usando o laço do-while		
		System.out.print("Solução for: [ ");
		for(aux = x0; aux <= xn; aux++)
		{
			System.out.print(aux + " ");
		}
		System.out.println("]");	
	}
}

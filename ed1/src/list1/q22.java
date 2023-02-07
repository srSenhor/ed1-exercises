package list1;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Informe o limite inferior: ");
		int a = cin.nextInt();
		
		System.out.print("Informe o limite superior: ");
		int b = cin.nextInt();
		
		
		//Solução b): Usando o laço do-while		
		
		int somatorio = 0;
		
		for(int i = a; i <= b; i++)
		{
			somatorio = somatorio + i;
		}
		
		System.out.println("Somatorio: " + somatorio);
	}
}



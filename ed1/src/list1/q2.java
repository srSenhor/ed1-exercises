package list1;

import java.util.Scanner;

public class q2 
{	
	public static void main(String[] args)
	{
		// =============================================
		
		Scanner cin = new Scanner(System.in);

		System.out.print("Digite seu nome completo: ");
		String my_name = cin.nextLine();
		
		System.out.print("Digite a primeira letra do seu nome: ");
		char first_char = cin.nextLine().charAt(0);
		
		System.out.print("Digite sua altura: ");
		float my_height = cin.nextFloat();
		
		System.out.print("Digite sua idade: ");
		int my_age = cin.nextInt();
		
		// =============================================
		
		System.out.println("\n\n\n\n\n");
		
		System.out.println("Nome completo: " + my_name);
		System.out.println("Primeira letra do nome: " + first_char);
		System.out.println("Idade: " + my_age + " anos");
		System.out.println("Altura: " + my_height + " cm");
		
		cin.close();
	}
}

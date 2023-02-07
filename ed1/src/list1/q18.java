package list1;

import java.util.Scanner;

public class q18 
{
	private static String senha = "odeiotodos";
	
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		String tentativa;
		/*
		//Solução a): laço while
		System.out.print("Digite a senha: ");
		tentativa = cin.nextLine();
		boolean owo = true;  
		
		while(owo) {
			if(tentativa.equalsIgnoreCase(senha)) {
				System.out.println("Senha correta!");
				owo = false;
			}
			else {
				System.out.println("Informe a senha certa seu baitola!");
				System.out.print("Digite a senha: ");
				tentativa = cin.nextLine();
			}
		}
		*/
		//Solução b): laço do-while				
			do
			{
				System.out.print("Digite a senha: ");
				tentativa = cin.nextLine();
			
				if(tentativa.equalsIgnoreCase(senha)) {
					System.out.println("Senha correta!");
				}
				else {
					System.out.println("Informe a senha certa seu baitola!");
				}
			}while(!tentativa.equalsIgnoreCase(senha));

	}

}

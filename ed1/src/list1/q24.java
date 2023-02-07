package list1;

import java.util.Scanner;

public class q24 
{
	private static Scanner cin = new Scanner(System.in);
	private static int op;
	
	public static void main(String[] args) 
	{
		boolean sair = false;
		double n0;
		
		do 
		{
			exibeMenu();
			switch(getOp()) 
			{
			case 1:
				System.out.print("Operando 1: ");
				n0 = cin.nextDouble();
				System.out.print("Operando 2: ");
				double n1 = cin.nextDouble();
						
				System.out.println(n0 + "**" + n1 + " = " + Math.pow(n0, n1));
				break;
			case 2:
				System.out.print("Operando 1: ");
				n0 = cin.nextDouble();
				
				System.out.println("sqrt(" + n0 + ") = " + Math.sqrt(n0));
				break;
			case 3:
				System.out.print("Operando 1: ");
				n0 = cin.nextDouble();
				
				System.out.println("Fatorial[ ]\b" + n0 + " = " + fat(n0));
				break;
			case 0:
				sair = true;
				System.out.println("Encerrando programa...");
				break;
			}
		}while(sair == false);
	}
	
	public static void exibeMenu()
	{
		System.out.println("Calculadora =============" + "\n");
		
		System.out.println("[1]" + " " + "Potenciação");
		System.out.println("[2]" + " " + "Raiz quadrada");
		System.out.println("[3]" + " " + "Fatorial");
		System.out.println("[0]" + " " + "Sair");
		
		System.out.print("\n" + "Operação: [ ]\b");
		int op = cin.nextInt();
		setOp(op);
		
		System.out.println("\n\n");
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
	
	
	private static void setOp(int op2) {
		if(op < 4 && op >= 0)
		{
			op = op2;
		}
		else
		{
			System.out.println("Opção inválida!");
		}
	}	
	public static int getOp() {
		return op;
	}

}
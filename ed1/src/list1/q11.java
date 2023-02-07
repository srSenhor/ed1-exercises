package list1;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
	
		Scanner cin = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria(100);
		ContaBancaria conta2 = new ContaBancaria(100);
		
		System.out.println("Info das contas");
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.print("Quanto deseja transferir? ");
		double v1 = cin.nextDouble();
		
		conta1.transferir(conta2, v1);
		
		System.out.println("Info das contas");
		System.out.println(conta1);
		System.out.println(conta2);		
		
	}

}

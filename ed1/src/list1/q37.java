package list1;

import java.util.Scanner;

public class q37 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Entre com um limite inferior: ");
		int a = cin.nextInt();
		System.out.print("Entre com um limite superior: ");
		int b = cin.nextInt();
		
		double startTime = System.currentTimeMillis();
		int exemplo1 = somatorioloop(a, b);
		double totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Somatorio iterativo: " + exemplo1 + "\nTempo de execução: " + totalTime);
		
		startTime = System.currentTimeMillis();
		exemplo1 = somatoriorecursivo(a, b);
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Somatorio recursivo: " + exemplo1 + "\nTempo de execução: " + totalTime);
		
		//É observável que o método iterativo é ligeiramente mais rápido.
		//Favor, testar com o intervalo [1. 4000]

	}
	
	public static int somatorioloop(int a, int b) {
		int result = 0;
		for(int i = a; i <= b; i++) {
			result = result + i;
		}
		return result;
	}

	public static int somatoriorecursivo(int a, int b) {
		int result = a;
		
		if(a != b) {
			result = result + somatoriorecursivo(a + 1, b);
		}
		
		return result;
	}
}

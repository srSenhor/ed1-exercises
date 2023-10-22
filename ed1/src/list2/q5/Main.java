package list2.q5;

import java.util.Scanner;

public class Main {
	
	
	public static void main (String [] args) {
		Lista<String> lista = new Lista<String>();
		Scanner cin = new Scanner(System.in);
		String teste = "Num ninho de mafagafos com sete mafagafinhos"
						+ ", quem desmafagifar o ninho dos mafagafos"
						+ "bom desmafagifador sera .";
		
		String palavra;
		palavra = cin.next();
		System.out.println(palavra);
		do{
			palavra = cin.next();
			
			if(!lista.search(palavra)) {
				lista.addLast(palavra);
			} else {				
				lista.increment(palavra);
			}
		}while(!palavra.equals("."));
		
		lista.show();
	}
}

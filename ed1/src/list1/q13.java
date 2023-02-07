package list1;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double n1 = cin.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		double n2 = cin.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		double n3 = cin.nextDouble();
		
		double media = ((n1 + n2 + n3)/3.0); 
		
		if(media < 3.0){
			System.out.print("O aluno está reprovado! :(");			
		}else if(media < 7.0) {
			System.out.print("Entre com a quarta nota: ");
			double n4 = cin.nextDouble();

			if(((media + n4)/2) > 5.0) {
				System.out.print("O aluno está aprovado (Nas últimas). :|");		
			}else {
				System.out.print("O aluno está reprovado (Nas últimas). :'(");
			}			
		}else {
			System.out.print("O aluno está aprovado!");
		}
	}

}

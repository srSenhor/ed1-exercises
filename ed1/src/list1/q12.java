package list1;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double n1 = cin.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		double n2 = cin.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		double n3 = cin.nextDouble();
		
		double media = ((n1 + n2 + n3)/3.0); 
		
		if(media >= 7.0){
			System.out.print("O aluno está aprovado!");
		}else if(media < 7.0 && media >= 3.0) {
			System.out.print("O aluno está em recuperação!");
		}else {
			System.out.print("O aluno está reprovado!");
		}
	}
}

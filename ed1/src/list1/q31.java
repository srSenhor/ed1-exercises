package list1;

import java.util.Scanner;

public class q31 {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão cadastradas?");
		int num_pessoas = cin.nextInt();
		
		Pessoa[] registro = new Pessoa[num_pessoas];
		Pessoa p;
		
		
		System.out.println("Entre com as seguintes informações.");
		for(int i = 0; i < num_pessoas; i++) {
			p = new Pessoa();
			cin.nextLine();
			
			System.out.print("CPF: ");
			p.setCpf(cin.nextLine());
			
			System.out.print("Nome: ");
			p.setNome(cin.nextLine());
			
			System.out.print("Sexo: ");
			p.setSexo(cin.nextLine());
			
			System.out.print("Idade: ");
			p.setIdade(cin.nextInt());
			System.out.print("Altura: ");
			p.setAltura(cin.nextDouble());
			System.out.print("Peso: ");
			p.setPeso(cin.nextDouble());
			p.calculaImc();
			
			registro[i] = p;
			
			System.out.println("");
		}
		
		
		for(int i = 0; i < num_pessoas; i++) {
			System.out.print(registro[i]);
		}
		
	}

}

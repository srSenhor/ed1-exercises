package list1;

import java.util.Scanner;
import java.math.*;

public class q08 {
	
	public static void main(String[] args) {

	Scanner cin = new Scanner(System.in);
		
	double peso, altura, total;
	
	System.out.print("Entre com o peso (Kg): ");
	peso = cin.nextDouble();
	System.out.print("Entre com o altura (m): ");
	altura = cin.nextDouble();
	
	if(altura > 0.0) {
		total = peso / (Math.pow(altura, 2));
		System.out.println(peso + " / " + altura + " = " + total);
	}else{
		System.out.println("Não é possível realizar divisão por 0.");
	}
	
	cin.close();
	}
}

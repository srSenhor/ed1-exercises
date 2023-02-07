package list1;

import java.util.Scanner;
import java.math.*;

public class q09 {

	public static void main(String[] args) {

	Scanner cin = new Scanner(System.in);
		
	System.out.print("Entre com o valor do raio: ");
	double raio = cin.nextDouble();
	
	System.out.print("Area = " + (Math.pow(Math.abs(raio), 2) * Math.PI));
		
	cin.close();
	}

}

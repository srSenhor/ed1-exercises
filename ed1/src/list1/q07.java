package list1;

import java.util.Scanner;

public class q07 {

	public static void main(String[] args) throws ArithmeticException {
		
	Scanner cin = new Scanner(System.in);
	
	double n1, n2, total;
	
	System.out.print("Entre com o primeiro numero: ");
	n1 = cin.nextDouble();
	System.out.print("Entre com o segundo numero: ");
	n2 = cin.nextDouble();
	
	if(n2 > 0.0) {
		total = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + total);
	}else{
		System.out.println("Não é possível realizar divisão por 0.");
	}
	
	cin.close();
	}
}


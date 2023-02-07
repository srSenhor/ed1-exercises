package list1;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		
		System.out.println("Para ax2 + bx1+ cx0 = 0, entre com...");
		
		System.out.print("a: ");
		double a = cin.nextDouble();
		
		System.out.print("b: ");
		double b = cin.nextDouble();
		
		System.out.print("c: ");
		double c = cin.nextDouble();
		
		calcFunc(a, b, calcDelta(a,b,c)); 
		
	}
	
	public static double calcDelta(double a, double b, double c) {
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public static void calcFunc(double a, double b, double delta) {
		if(delta < 0) {
			System.out.println("Não há raízes reais.");
		}else if(delta == 0) {
			System.out.println("Raiz: " + (-b/(2*a)));
		}else {
			System.out.println("Raiz 1: " + ((-b + delta)/(2*a)));
			System.out.println("Raiz 2: " + ((-b - delta)/(2*a)));
		}
	}

}

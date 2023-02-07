package list1;

import java.util.Scanner;

public class q06 
{
	public static void main(String[] args)
	{
			final float SODA_PRICE = 1.50f;
			final float SLICE_PRICE = 3.00f;
			final float WAITER_COMMISSION = 0.1f;
			
			// ===========================================
			
			Scanner cin = new Scanner(System.in);

			System.out.print("Qtd. refrigerantes pedidos: ");
			int qt_soda = cin.nextInt();
			
			System.out.print("Qtd. fatias de pizza pedidas: ");
			int qt_slice = cin.nextInt();
			
			System.out.print("Qtd. pessoas na mesa: ");
			int qt_costumers = cin.nextInt();
			
			// ===========================================
			
			double total = ((qt_soda * SODA_PRICE) + (qt_slice * SLICE_PRICE));
			
			System.out.println("Total s/taxa: " + total);
			System.out.println("Total c/taxa: " + (total + (total * WAITER_COMMISSION)));
			System.out.println("Rateio por pessoa: " + ((total + (total * WAITER_COMMISSION))/qt_costumers));
			
			
			cin.close();
	}
}

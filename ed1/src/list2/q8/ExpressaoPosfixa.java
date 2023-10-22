package list2.q8;

import java.util.Scanner;

import list2.q6.Pilha;

public class ExpressaoPosfixa {
	public static void main (String [] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Digite uma expressão no formato posfixo: ");
		String str = cin.nextLine();
		
		int result = resolveExpressao(str);
		
		System.out.println("O resultado da expressão é: " + result);
		
		
	}
	
	public static int resolveExpressao(String str) {
		
		String[] cropped = str.split("\\s+");
		Pilha<Integer> pilha = new Pilha<Integer>();
		int result = 0, op2, op1;
		
		
		for(int i = 0; i < cropped.length; i++) {
			switch(cropped[i]) {
				case "+":
					op1 = pilha.pop();
					op2 = pilha.pop();
					result = op1 + op2;
					pilha.push(result);
					break;
				case "-":
					op1 = pilha.pop();
					op2 = pilha.pop();
					result = op1 - op2;
					pilha.push(result);
					break;
				case "*":
					op1 = pilha.pop();
					op2 = pilha.pop();
					result = op1 * op2;
					pilha.push(result);
					break;
				case "/":
					op1 = pilha.pop();
					op2 = pilha.pop();
					result = op1 / op2;
					pilha.push(result);
					break;
				default:
					int num = Integer.parseInt(cropped[i]);
					pilha.push(num);
			}
		}
		return pilha.pop();
		
		
	}
}

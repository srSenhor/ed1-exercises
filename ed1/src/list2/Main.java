package list2;

import list2.q1.PilhaVetor;
import list2.q1.PilhaVetorInterface;
import list2.q3.ListaEncadeada;
import list2.q3.ListaEncadeadaSimples;
import list2.q4.ListaEncadeadaDupla;
import list2.q6.Pilha;
import list2.q7.Fila;

public class Main {
	
	public static void main(String [] args) {
		//PilhaVetorInterface<String> Safado = new PilhaVetor<String>();
		//ListaEncadeada<String> Safado = new ListaEncadeadaSimples<String>();
		//ListaEncadeada<String> Safado = new ListaEncadeadaDupla<String>();
		//Pilha<String> Safado = new Pilha<String>();
		Fila<String> Safado = new Fila<String>();
		
		/*
		Safado.push("Bababoi");
		Safado.push("Bota um prato de comida pra mim");
		Safado.push("Qiyana foi buffada fml B) (y) ganhamo");
		Safado.push("MUGICHAAAAAAAN");
		Safado.push("Mim de papai");
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
		
		System.out.println("Ultimo elemento: " + Safado.peek());
		
		
		String a = Safado.pop();
		System.out.println("Elemento que saiu: " + a);
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
		
		a = Safado.pop();
		System.out.println("Elemento que saiu: " + a);
		
		System.out.println("Ultimo elemento: " + Safado.peek());
		
		System.out.println("Tentando remover \"" + a + "\"");
		Safado.pop();
		
		System.out.println("Tentando remover \"" + a + "\"");
		Safado.pop();
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
		*/
		
		Safado.add("Bababoi");
		Safado.add("Bota um prato de comida pra mim");
		Safado.add("Qiyana foi buffada fml B) (y) ganhamo");
		Safado.add("MUGICHAAAAAAAN");
		Safado.add("Mim de papai");
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
		
		System.out.println("Ultimo elemento: " + Safado.peek());
		
		
		String a = Safado.remove();
		System.out.println("Elemento que saiu: " + a);
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
		
		a = Safado.remove();
		System.out.println("Elemento que saiu: " + a);
		
		System.out.println("Ultimo elemento: " + Safado.peek());
		
		System.out.println("Tentando remover \"" + a + "\"");
		a = Safado.remove();
		
		System.out.println("Tentando remover \"" + a + "\"");
		a = Safado.remove();
		
		System.out.println("Mostrando todos os elementos");
		Safado.show();
	
	
	}
}

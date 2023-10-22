package list2.q9;

import list2.q7.Fila;

public class MedeDistancia {
	public static void main(String [] args) {
		Fila<Integer> cidades = new Fila<Integer>();
		
		int cidadeInicial = 3;
		int[][] mapa = {{0, 3, 0, 0, 0, 0}, 
						{0, 0, 1, 0, 0, 0}, 
						{0, 0, 0, 0, 1, 0},
						{0, 0, 2, 0, 1, 0},
						{1, 0, 0, 0, 0, 0},
						{0, 1, 0, 0, 0, 0}};
		
		int[] resultado = {-1, -1, -1, 0, -1, -1};
		
		cidades.add(cidadeInicial);
		
		for(int i = 0; i < resultado.length; i++) {
			mapa[cidadeInicial][i];
		}
		//Não sei o que fazer, vejo isso depois
	}
}

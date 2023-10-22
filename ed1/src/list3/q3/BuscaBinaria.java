package list3.q3;

public class BuscaBinaria {
	public static void main(String [] args) {
		int [] vetor = {2, 4, 5, 6, 8, 12, 23, 39};
		
		int inicio = 0, meio = 0, fim = vetor.length - 1;
		int pos = -1, procurado = 5;
		
		while(inicio < fim) {
			meio = (inicio + fim) / 2;
			if(procurado < vetor[meio]) {
				fim = meio;
			} else if(procurado > vetor[meio]){
				inicio = meio;
			} else {
				inicio = vetor.length;
				pos = meio;
			}
		}
		
		System.out.println("Posicao do elemento buscado: " + pos);
		
	}
}

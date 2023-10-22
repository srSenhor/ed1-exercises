package list3.q1;

public class BuscaLinear{
	public static void main(String [] args) {
		int [] vetor = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		int procurado = 1, pos = -1;
		
		
		for (int i = 0; i < vetor.length && pos == -1; i++) {
			if(vetor[i] == procurado) pos = i;
		}
		
		System.out.println("Posição no vetor: " + pos);
	}
}


package list1;

public class q38 {

	public static void main(String[] args) {
		Pessoa[] reg = new Pessoa[3];
		reg[0] = new Pessoa("2142314534", "Arnaldo", 1.56, 43.5);
		reg[1] = new Pessoa("4234525435", "Romeno", 1.56, 43.5);
		reg[2] = new Pessoa("8954964545", "hgomf", 1.76, 56.5);
		
		ExibeVetor(reg, 2);
		ExibeObjeto(reg[2]);

	}
	
	public static <T> void ExibeVetor(T[] vetor, int tam){
		for(int i = 0; i < tam; i++) {
			System.out.println(vetor[i]);
		}
	}

	public static <T> void ExibeObjeto(T objeto){
		System.out.println(objeto.toString());
	}
	
}

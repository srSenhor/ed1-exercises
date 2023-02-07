package list1;

public class q30 {
	private static String frase = "bom dia"; 
	public static void main(String[] args) {
		
		System.out.println("Frase: " + frase);
		
		inverteFrase(frase);
		
		System.out.println("Frase invertida: " + frase);
				 
	}
	
	public static void inverteFrase(String frase) {
		String novafrase = "";
		
		for(int i = (frase.length() - 1); i >= 0; i--) {
			novafrase = novafrase + frase.charAt(i);
		}
		setFrase(novafrase);
	}

	public static String getFrase() {
		return frase;
	}

	private static void setFrase(String frase) {
		q30.frase = frase;
	}
	
}

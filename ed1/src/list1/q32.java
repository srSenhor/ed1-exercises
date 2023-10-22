package list1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q32 {

	public static void main(String[] args) {
		String path = "temp/registro.dat";
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão cadastradas?");
		int num_pessoas = cin.nextInt();
		
		List<Pessoa> registro = new ArrayList<Pessoa>(num_pessoas);
		Pessoa p;
		
		/*
		System.out.println("Entre com as seguintes informações.");
		for(int i = 0; i < num_pessoas; i++) {
			p = new Pessoa();
			cin.nextLine();
			
			System.out.print("CPF: ");
			p.setCpf(cin.nextLine());
			System.out.print("Nome: ");
			p.setNome(cin.nextLine());
			System.out.print("Sexo: ");
			p.setSexo(cin.nextLine());
			System.out.print("Idade: ");
			p.setIdade(cin.nextInt());
			System.out.print("Altura: ");
			p.setAltura(cin.nextDouble());
			System.out.print("Peso: ");
			p.setPeso(cin.nextDouble());
			p.calculaImc();
			
			registro.add(p);
			System.out.println("");
		}
		
		try {
			escritor(path, registro);
		}catch(IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		}
		
		registro.clear();
		*/
		// ---------------------------------------------------------------
		
		try {
			registro = leitor(path);
	
			
			for (Pessoa p2 : registro) 
			{
				System.out.print( p2.toString() );
			}
			
		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}
		
		for(Pessoa p2 : registro) {
			System.out.print(p2);
		}
		

	}

	public static<E> void escritor(String path, List<E> lista) throws IOException 
	{
		File file = new File(path);
    	file.delete();
        file.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
        
        objOutput.writeObject(lista);
        objOutput.close();
	}
	

	@SuppressWarnings("unchecked")
	public static <E> List<E> leitor(String path) throws IOException, ClassNotFoundException 
	{
		List<E> registro = new ArrayList<E>();
		
		File file = new File(path);
	    
		if(file.exists()) 
		{
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
			registro = (ArrayList<E>) objInput.readObject();
	        objInput.close();
		}
		
		return registro;
	}
}

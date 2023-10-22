package list1;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private String cpf;
	private String nome;
	private String sexo;
	private int idade;
	private double peso;
	private double altura;
	private double imc;
	
	public Pessoa(String cpf, String nome, double altura, double peso) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		calculaImc();
	}
	public Pessoa() {
		
	}

	//default getters and setters...
	//Não fiz as validações para os getters e setters pois a questão é apenas a titulo de exemplo...
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getImc() {
		return imc;
	}
	
	public void calculaImc() {
		setImc();
	}

	private void setImc() {
		imc = peso / Math.pow(altura, 2);
	}



	@Override
	public String toString() {
		return 	"Nome: " + nome + "\n" +
				"CPF: " + cpf + "\n" +
				"Sexo: " + sexo + "\n" +
				"Idade: " + idade + "\n" +
				"Peso: " + peso + "\n" +
				"Altura: " + altura + "\n" +
				"IMC: " + imc + "\n" + "\n";
	}
	
	
	
}

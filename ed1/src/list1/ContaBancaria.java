//Classe usada pela questão 10

package list1;

public class ContaBancaria {
	private double saldo;
	private int idConta;
	private static int nContas;
	
	public ContaBancaria(double saldo) {
		nContas++;
		idConta = nContas;
		this.saldo = saldo;
	}
	public ContaBancaria() {
		nContas++;
		idConta = nContas;
		this.saldo = 0.0;
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double saldo) {
		if(saldo > 0.0){
			this.saldo += saldo;
		}else {
			System.out.println("Não foi possível realizar operação.");
		}
	}
	
	public void sacar(double saldo) {
		if(saldo < this.saldo && saldo > 0.0){
			this.saldo -= saldo;
		}else {
			System.out.println("Não foi possível realizar operação.");
		}
	}
	
	public void transferir(ContaBancaria cb, double saldo) {
		sacar(saldo);
		if(cb != null) {
			cb.depositar(saldo);
		}
	}

	@Override
	public String toString() {
		return "Conta " + this.idConta + " possui R$ " + this.saldo + " de saldo.";
	}
	
	
}

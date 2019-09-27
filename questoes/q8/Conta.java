package q8;

public class Conta {
	int numero = 123;
	String titular;
	String agencia = "caixa";
	double saldo;
	
	void saca(double quantidade){
		double novoSaldo = (this.saldo - quantidade);
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade){
		this.saldo +=quantidade;
	}
	
	double calculaRendimento(){
			double novoSaldo=(saldo*0.1);
			return saldo += novoSaldo;
	}
	
	
}

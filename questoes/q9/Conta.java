package q9;

public class Conta {
	int numero;
	String titular;
	String agencia = "caixa";
	double saldo = 5;
	
	public double getSaca(){
		return saldo;
	}
	public void saca(double quantidade){
		double novoSaldo = (this.saldo - quantidade);
		this.saldo = novoSaldo;
	}
	
	public double getDeposita(){
		return saldo;
	}
	public void deposita(double quantidade){
		this.saldo +=quantidade;
	}
	
	public double getRendimento(){
		return saldo;
	}
	public double calculaRendimento(){
			double novoSaldo=(saldo*0.1);
			return saldo += novoSaldo;
	}
	
	String recuperaDadosParaImpressao(){
			String dados = "titular: "+this.titular;
			dados +="\nNumero: "+this.numero;
			dados +="\nAgencia: "+this.agencia;
			dados +="\nSaldo: "+this.saldo;
			dados +="\nRendimento: "+this.calculaRendimento();
			return dados;
	}
	
}

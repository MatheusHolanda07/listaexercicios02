package q8;

public class Main {
	public static void main(String[] args) {
	Conta minhaConta;
	minhaConta = new Conta();
	
	minhaConta.titular = "matheus";
	minhaConta.saldo = 1000.0;
	
	minhaConta.saca(200);
	
	minhaConta.deposita(500);
	
	minhaConta.calculaRendimento();
	
	System.out.println("salto do "+minhaConta.titular+" é de :"+minhaConta.saldo+"" +
			"\n numero: "+minhaConta.numero+" Agencia: "+minhaConta.agencia);
}
}

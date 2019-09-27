package q9;

public class Main {
	public static void main(String[] args) {

	Conta c1 = new Conta();
	
	c1.titular = "matheus";
	c1.saldo = 1000.0;
	c1.numero = 123;
	
	Conta c2 = new Conta();
	c2.titular = "Moises";
	c2.saldo = 2000.0;
	c2.numero = 321;
	
	//c1.calculaRendimento();
	
	System.out.println("\n"+c1.recuperaDadosParaImpressao());
	System.out.println("\n"+c2.recuperaDadosParaImpressao());

}
}

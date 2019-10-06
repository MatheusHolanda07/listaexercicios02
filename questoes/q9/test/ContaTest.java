package q9.test;

import static org.junit.Assert.*;

import org.junit.Test;

import q9.Conta;

public class ContaTest {
	Conta conta = new Conta();
	
	@Test
	public void teste1(){
		conta.saca(2);
		assertFalse(conta.getSaca()==2);
	}
	
	@Test
	public void teste2(){
		conta.deposita(5);
		assertFalse(conta.getDeposita()==5);
	}
	
	@Test
	public void teste3(){
		conta.calculaRendimento();
		assertTrue(conta.getRendimento()==5.5);
	}
	
	
}

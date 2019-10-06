package q1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import q1.Lampada;


public class LampadaTest {

	Lampada lampada = new Lampada();
	
	@Test
	public void teste1(){
		lampada.getLiga();
		assertTrue(lampada.getLiga()== false);
		
}
}

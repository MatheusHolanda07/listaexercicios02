package q2.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import q2.Lampada;

public class LampadaTest {

		Lampada lampada = new Lampada();
		
		@Test
		public void teste1(){
			lampada.getLiga();
			assertTrue(lampada.getLiga()== false);
			
	
}
		}

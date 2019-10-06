package q3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import q3.Quadrado;

public class QuadradoTest {
	Quadrado quadra = new Quadrado();
	
	@Test
	public void test1(){
		quadra.Quadrado(4);
		assertTrue(quadra.getQuadrado()==4);	
	}
	
	@Test
	public void test2(){
		quadra.area();
		assertTrue(quadra.getArea()==0);
	}
	
	@Test
	public void test3(){
		quadra.perimetro();
		assertTrue(quadra.getPerimetro()==0);
	}
	
}

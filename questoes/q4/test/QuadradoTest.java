package q4.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import q4.Quadrado;



public class QuadradoTest {
		Quadrado quadra1 = new Quadrado();
		Quadrado quadra2 = new Quadrado();
		Quadrado quadra3 = new Quadrado();
		
		@Test
		public void test1(){
			quadra1.quadrado(4);
			assertTrue(quadra1.getQuadrado()==4);	
		}
		
		@Test
		public void test2(){
			quadra1.area();
			assertTrue(quadra1.getArea()==0);
		}
		
		@Test
		public void test3(){
			quadra1.perimetro();
			assertTrue(quadra1.getPerimetro()==0);
		}
		
		
		
		
		@Test
		public void test4(){
			quadra2.quadrado(2*2);
			assertTrue(quadra2.getQuadrado()==4);	
		}
		
		@Test
		public void test5(){
			quadra2.area();
			assertTrue(quadra2.getArea()==0);
		}
		
		@Test
		public void test6(){
			quadra2.perimetro();
			assertTrue(quadra2.getPerimetro()==0);
		}
		
		
		
		
		
		@Test
		public void test7(){
			quadra3.quadrado(3*3);
			assertTrue(quadra3.getQuadrado()==9);	
		}
		
		@Test
		public void test8(){
			quadra3.area();
			assertTrue(quadra3.getArea()==0);
		}
		
		@Test
		public void test9(){
			quadra3.perimetro();
			assertTrue(quadra3.getPerimetro()==0);
		}
}

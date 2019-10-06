package q7.test;
import org.junit.Test;

import q7.Estoque;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EstoqueTest {
	
	    
	    Estoque estoque = new Estoque();
	    
	    @Test 
	    public void teste(){
	        estoque.mudarNome("Bruno");
	        assertTrue(estoque.getNome().equals("Bruno"));
	    }      
	    
	    @Test
	    public void teste2(){
	        estoque.mudarQtdMinima(2);
	        assertFalse(estoque.getMin() == 1);
	    }
	    
	    @Test
	    public void teste3(){
	    
	        assertFalse(estoque.getAtual() == 4);
	    }
	  
	}


package q6;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	public Estoque(){
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima){
		
	}
	
	 void mudarNome(String nome){
		
	}
	 
	 void mudarQtdMinima(int qtdMinima){
		
	}
	 
	 void repor(int qtd){
		 qtdAtual += qtd;
	}
	 
	 void darBaixa(int qtd){
		 qtdAtual -=qtd;
	}
	 
	 String mostra(String nome, int qtdAtual, int qtdMinima){
		System.out.println("produto -> "+nome+"\nquantidade atual-> "+qtdAtual+"\nquantidade minima-> "+qtdMinima);
		return nome;
	}
	 
	 boolean precisaRepor(){
		 if(qtdAtual <=qtdMinima){
			 return true;
		 }else{
			 return false;
		 }
	 }
	
}

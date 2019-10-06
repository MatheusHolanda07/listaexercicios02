package q7;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	public Estoque(){}
	public Estoque(String nome, int qtdAtual, int qtdMinima){}
	
	
	public String getNome(){
        return nome;}
	public void mudarNome(String nome){
		this.nome = nome;}
	 
	
	public int getMin(){
        return qtdMinima;}
	public void mudarQtdMinima(int qtdMinima){
		this.qtdMinima = qtdMinima;}
	 
	
	public int getAtual(){
	       return qtdAtual ;}
	    
	    public void atual(int qtdAtual){
	        this.qtdAtual = qtdAtual;
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

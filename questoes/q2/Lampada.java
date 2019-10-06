package q2;

public class Lampada{
	 boolean ligada;
	 boolean desligada;
	
	public boolean getLiga(){
		return ligada;
	}
	public void liga(boolean ligada){
	ligada = true;
	}
	
	
	
	public boolean getDesliga(){
		return desligada;
	}
	public void desliga(boolean desligada){
	desligada = false;
	}
	public String observa(){
	if(ligada){
	return "ligada";
}else{
	return "desligada";
	}
}
}
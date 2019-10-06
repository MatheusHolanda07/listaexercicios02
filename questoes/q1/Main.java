package q1;

public class Main{
public static void main(String args[]){
	
	Lampada lampada = new Lampada();
	lampada.getLiga();
	System.out.println(lampada.observa());
	lampada.getDesliga();
	System.out.println(lampada.observa());
}
}

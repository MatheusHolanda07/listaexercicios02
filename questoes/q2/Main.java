package q2;



public class Main{
	public static void main(String args[]){
		
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();
		
		lampada1.getLiga();
		System.out.println("lampada 1 "+lampada1.observa());
		lampada2.getDesliga();
		System.out.println("lampada 2 "+lampada2.observa());
}
}

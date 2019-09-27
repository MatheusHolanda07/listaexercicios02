package q3;

public class Quadrado {
	double lado = 2;
	void Quadrado(double lado){
		lado = lado;
	}
	
	
	double area(){
		return (lado*lado);
	}
	
	double perimetro(){
		return (4*lado);
	}
}

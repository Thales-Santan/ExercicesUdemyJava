package section7.poo;

public class Triangle {
 
	public double coteA;
	public double coteB;
	public double coteC;
	
	
	public double area() {
		double aux = (coteA + coteB + coteC) / 2;
		return Math.sqrt((aux*(aux-coteA)*(aux-coteB)*(aux-coteC)));
	}
}

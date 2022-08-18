//Calcular a area de dois triangulos e informar qual tem a area maior, usando POO (Olhar classe Triangle)
// Calculer l'area de deux triangles et qui possède l'area majeure, en utilisant POO (voir la classe Triangle)

package section7.poo;

import java.util.Scanner;

public class ExUnAvecPoo {

	public static void main(String[] args) {
		Scanner cv = new Scanner (System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Tapez les cotées du triangle X: ");
		x.coteA = cv.nextDouble();		
		x.coteB = cv.nextDouble();		
		x.coteC = cv.nextDouble();		
		
		System.out.println("Tapez les cotées du triangle Y: ");
		y.coteA = cv.nextDouble();
		y.coteB = cv.nextDouble();
		y.coteC = cv.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("L'area du triangle X est: %.2f%n",areaX);
		System.out.printf("L'area du triangle Y est: %.2f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Le triangle X a l'area majeur!");
		}
		else {
			System.out.println("Le triangle Y a l'area majeur!");
		}
		
		cv.close();
	}
}

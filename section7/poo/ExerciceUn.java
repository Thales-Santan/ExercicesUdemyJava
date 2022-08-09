//Calcular a area de dois triangulos e informar qual tem a area maior, sem usar POO
// Calculer l'area de deux triangles et qui possède l'area majeure, sans utiliser POO

package section7.poo;

import java.util.Scanner;

public class ExerciceUn {

	public static void main(String[] args) {
		Scanner cv = new Scanner (System.in);
		
		double cote[] = {0.0 , 0.0 , 0.0};
		double triangleUn = 0.0 , triangleDeux = 0.0 , aux = 0.0;
		
		
		for( int i = 0; i<3 ;i++) {
			System.out.printf("Tapez la cotée %d du premier triangle: %n",(i+1));
			cote[i] = cv.nextDouble();
		}
		aux = (cote[0]+cote[1] + cote[2]) / 2;
		triangleUn = Math.sqrt((aux*(aux-cote[0])*(aux-cote[1])*(aux-cote[2])));
		
		for( int i = 0; i<3 ;i++) {
			System.out.printf("Tapez la cotée %d du deuxième triangle: %n",(i+1));
			cote[i] = cv.nextDouble();
		}
		aux = (cote[0]+cote[1] + cote[2]) / 2;
		triangleDeux = Math.sqrt((aux*(aux-cote[0])*(aux-cote[1])*(aux-cote[2])));
		
		if (triangleUn > triangleDeux) {
			System.out.println("Le triangle 1 a l'area majeuer !");
		} 
		else if (triangleDeux > triangleUn) {
			System.out.println("Le triangle 2 a l'area majeuer !");
		}
		else {
			System.out.println("Tous les deux ont la même taille d'area!");
		}
		
		System.out.printf("L'area du triangle 1 est: %.2f%n",triangleUn);
		System.out.printf("L'area du triangle 2 est: %.2f",triangleDeux);
		
		cv.close();
	}

}

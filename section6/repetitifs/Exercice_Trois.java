/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso / Lisez un nombre entier X (1 <= X <= 1000). Ensuite, montrez les impairs de l'un jusqu'au X,
un par ligne, en incluant le X si necessaire.*/

package section6.repetitifs;

import java.util.Scanner;

public class Exercice_Trois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = 0;
		
		while(X<1 || X>1000) {
			X = sc.nextInt();
		}
		
		for(int i=1 ;i<=X; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		};
		
		sc.close();
	}

}

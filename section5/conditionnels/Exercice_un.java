/* Ler um número inteiro, e depois dizer se este número é negativo ou não.
 * Lire un nombre entier, et après dire si ce nombre est négatif ou pas.
 */

package section5.conditionnels;

import java.util.Scanner;

public class Exercice_un {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt();
		if(n1<0) {
			System.out.println("Le nombre est négatif");
		} 
		else if (n1>0) {
			System.out.println("Le nombre est positif!");
		}
		else {
			System.out.println("Le nombre est neutre!");
		}
		sc.close();
	}

}

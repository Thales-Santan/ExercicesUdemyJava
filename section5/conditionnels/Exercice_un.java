/* Ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
 * Lire un nombre entier, et apr�s dire si ce nombre est n�gatif ou pas.
 */

package section5.conditionnels;

import java.util.Scanner;

public class Exercice_un {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt();
		if(n1<0) {
			System.out.println("Le nombre est n�gatif");
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

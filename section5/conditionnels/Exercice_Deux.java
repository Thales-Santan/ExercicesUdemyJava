/*Ler 2 numeros inteiros e informar se sao multiplos ou nao /
 *Lire 2 nombres entiers et informer s'ils sont multiples ou nom
 */

package section5.conditionnels;

import java.util.Scanner;

public class Exercice_Deux {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1 = 0, n2 = 0;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1%n2==0) {
			System.out.println("Les nombres sont multiples!");
		}
		else {
			System.out.println("Les nombres ne sont pas multiples!");
		}
		
		sc.close();
	}

}

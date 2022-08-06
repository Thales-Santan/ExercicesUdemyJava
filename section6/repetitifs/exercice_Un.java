/*Ler uma serie de numeros inteiros digitados e parar quando for digitado o zero. Em seguida, mostrar a 
 * soma de todos os numeros digitado/ Lire une série des nombres entiers tapés et arreter lorsque le zéro est tapé
 * Ensuit, afficher la somme de tous les nombres déjà tapés */

package section6.repetitifs;
import java.util.Scanner;

public class exercice_Un {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nombre = sc.nextInt();
		int somme = 0;

		while (nombre != 0) {
			somme += nombre;
			nombre = sc.nextInt();
		}

		System.out.printf("La somme de tous les nombres tapés est: %d", somme);

		sc.close();
	}

}

/*Ler uma serie de numeros inteiros digitados e parar quando for digitado o zero. Em seguida, mostrar a 
 * soma de todos os numeros digitado/ Lire une s�rie des nombres entiers tap�s et arreter lorsque le z�ro est tap�
 * Ensuit, afficher la somme de tous les nombres d�j� tap�s */

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

		System.out.printf("La somme de tous les nombres tap�s est: %d", somme);

		sc.close();
	}

}

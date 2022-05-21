/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
 * mostrando essas informações conforme exemplo 
 * (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)/ 
 * Lisez une valeur entière N. Cette valeur sera la quantité de valeurs entières X qui seront lues ci-dessous.
 * Indiquez combien de ces valeurs X se situent dans l'intervalle [10-20] et combien sont hors de l'intervalle, 
 * en montrant cette information selon l'exemple (utiliser le mot "in" dans l'intervalle, et "out" à l'extérieur de l'intervalle)*/

package sectionsixrepetitifs;

import java.util.Scanner;

public class Exercice_Quatre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i =0;i<N;i++) {
			int X = sc.nextInt();
			if(X>=10 && X<=20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in \n", in);
		System.out.printf("%d out \n", out);
		
		sc.close();
	}

}

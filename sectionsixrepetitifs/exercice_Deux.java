/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura
de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
 corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
 Considere que a senha correta � o valor 2002/ �crivez un programme  que r�p�te la lecture d'un mot de
 passe jusqu'� ce qu'il soit valide. Pour chaque lecture de mot de passe incorrect, inform�, �crivez:
 "mot de passe invalide" . Lorsque le mot de passe est inform� correctement, montrer la message "Acces
 permis" et le programme doit terminer.  Consid�rez que le mot de passe correct est la valeur 2002 x*/

package sectionsixrepetitifs;

import java.util.Scanner;

public class exercice_Deux {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int motDePasse = sc.nextInt();

		while (motDePasse != 2002) {
			System.out.println("Mot de passe invalide!");
			motDePasse = sc.nextInt();
		}

		System.out.println("Acces permis!");
		sc.close();
	}

}

//Criar um programa simples de gestao de estoque,com movimentaçao de estoque, valor unitario e  valor total. Ver classe Produto.
//Faire un program simple de gestion d'inventaire, avec movimentation , valeur unitaire et valeur totale. Voir la Classe Produit.
package section7.poo;

import java.util.Locale;
import java.util.Scanner;

public class ExDeux {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA_FRENCH);
		Scanner cv = new Scanner(System.in);

		int option = 0;
		Produit produit = new Produit();

		System.out.println("Quel est le nom du Produit?");
		produit.nom = cv.nextLine();
		System.out.println("Quel est le prix du " + produit.nom + "?");
		produit.valeur = cv.nextDouble();
		System.out.println("Combien de ce produit est en inventaire ?");
		produit.quantite = cv.nextInt();

		System.out.println(produit);

		do {
			System.out.printf("Voulez-vous movimenter l'inventaire de %s?%n", produit.nom);
			System.out.printf("1 - Oui, ajouter! %n2 - Oui , retirer %n3 - Non%n");
			option = cv.nextInt();

			switch (option) {
			case 1:
				int produitsAjoutes = 0;
				System.out.printf("Combien de %s seront rajoutés?%n", produit.nom);
				produitsAjoutes = cv.nextInt();
				produit.addDesProduits(produitsAjoutes);
				System.out.println(produit);
				break;
			case 2:
				int produitsRetires = 0;
				System.out.printf("Combien de %s seront retirés?%n", produit.nom);
				produitsRetires = cv.nextInt();
				produit.retireeDesProduits(produitsRetires);
				System.out.println(produit);
				break;
			case 3:
				System.out.println("Ciao!");
				break;

			default:
				System.out.println("Choix incorrect!");
				break;
			}
		} while (option != 3);

		System.out.println(produit);

		cv.close();
	}

}

//Relativo ao Ex 2 / Relatif � l'exercice 2
package section7.poo;

public class Produit {
	public String nom;
	public double valeur;
	public int quantite;

	public double valeurTotalDeProduits() {
		return valeur * quantite;
	}

	public void retireeDesProduits(int quantite) {
		this.quantite -= quantite;
	}

	public void addDesProduits(int quantite) {
		this.quantite += quantite;
	}

	public String toString() {
		return "\nProduit:" + nom + "\nQuantit� en stock: " + quantite + "\nValeur unitaire: "
				+ String.format("%.2f", valeur) + "\nMontant total: " + String.format("%.2f", valeurTotalDeProduits())+ "\n";
	}
}

package section7.poo;

public class Produit {
	public String nom;
	public double valeur;
	public int quantite;
	
	public double valeurTotalDeProduits() {
		return  valeur * quantite;
	}
	
	public void retireeDesProduits(int quantite) {
		this.quantite += quantite;
	}
	
	
}

package m2i.java.bdd;

public class Principale {

	public static void main(String[] args) {
		// Le code ci-dessous cr�e une seule instance de la classe Singleton_Personne
		// On ne peut cr�er d'autre instance (cf. p2 = adresse et attributs inchang�s)
		
		Personne p1 = Singleton_Personne.getInstance("Alpha", "Alice");
		System.out.println(p1);
		p1.Afficher();

		Personne p2 = Singleton_Personne.getInstance("Beta", "Bernard");
		System.out.println(p2);
		p2.Afficher();
	}

}

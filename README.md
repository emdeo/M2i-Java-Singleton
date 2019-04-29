# M2i-Java-Singleton
Introduction aux singletons : le code ci-joint ne permet de créer qu'une seule instance de classe Personne ("Alice Alpha"), impossible de modifier ses attributs.

Code : 

  public class Principale {

    public static void main(String[] args) {
      Personne p1 = Singleton_Personne.getInstance("Alpha", "Alice");
      System.out.println(p1);
      p1.Afficher();

      Personne p2 = Singleton_Personne.getInstance("Beta", "Bernard");
      System.out.println(p2);
      p2.Afficher();
    }

  }
  
Résultat :
  
  m2i.java.bdd.Personne@4aa8f0b4
  Alice Alpha
  m2i.java.bdd.Personne@4aa8f0b4
  Alice Alpha

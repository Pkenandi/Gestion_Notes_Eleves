package tp3.Exercice_1;

public class TestDocument {

	public static void main(String[] args) throws NumEngInvalidException, PrixInvalidException 
	{
;
		/*Livre L = new Livre(5,"La vie","Roger",50);
		Roman R = new Roman(25,"Casiopée","Jack",500,700);
		Manuels M = new Manuels(10,"Conjugaison","Bernard",17,5);
		Revues Rv = new Revues(16,"Journal",06,2020);
		
		System.out.println(" ---- [ Affichage ] ---- \n ");
		
		System.out.println("\n " + L.toString());
		System.out.println("\n " + R.toString());
		System.out.println("\n " + M.toString());
		System.out.println("\n " + Rv.toString());*/
		
		System.out.println(" ----[ Bibliotheque ] ----- \n");
		
		Bibliotheque Bib = new Bibliotheque(5);
		
		Bib.Ajouter(new Livre(5,"La vie","Roger",50));
		Bib.Ajouter(new Dictionnaires(10,"Larousse","Ang"));
		Bib.Ajouter(new Roman(25,"Casiopée","Jack",500,700));
		Bib.Ajouter(new Manuels(10,"Conjugaison","Bernard",17,5));
		Bib.Ajouter(new Revues(16,"Journal",06,2020));
		Bib.Ajouter(new Roman(7,"Pere riche, pere pauvre","Kawazaki",66,250));
		
		Bib.Afficher();
		
		
	}

}

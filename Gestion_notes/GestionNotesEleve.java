import java.util.*;

enum Admissibilite // Definition de L'enumeration des Mentions
{
	N("Non Admis"), P(" Passable"), AB("Assez Bien"), B("Bien"), TB(" Tres Bien"), NF(" Not Found !!");

	final String Mention;

	Admissibilite(String M) // Constructeur pour initialiser les attributs
	{
		Mention = M;
	}

}

class Eleve {

	private String Nom;
	private Admissibilite Resultat;
	private Integer NbrNotes;
	private Vector<Double> TabNotes;

	// Accesseurs

	public String getNom() {
		return this.Nom;
	}

	public Admissibilite getResultat() {
		return this.Resultat;
	}

	public Integer getNbrNotes() {
		return this.NbrNotes;
	}

	// Constructeurs

	public Eleve() {

	}

	public Eleve(String N, Integer Nbr) {
		this.Nom = N;
		this.NbrNotes = Nbr;
		this.TabNotes = new Vector<Double>(this.NbrNotes);
	}

	public String toString() {
		return " Nom : " + this.Nom + "\n [" + this.GetMention(this.Moyenne()).Mention + "] \n Moyenne => " + this.Moyenne()
				+ " \n ";
	}

	public Eleve Saisir() {
		Scanner Sc = new Scanner(System.in);
		Eleve E = new Eleve();

		System.out.print(" Nom : ");
		E.Nom = Sc.nextLine();
		System.out.print(" Nombre des notes obtenues : ");
		E.NbrNotes = Sc.nextInt();

		E.TabNotes = new Vector<Double>(E.NbrNotes); // Initialisation du tableau
		for (int i = 0; i < E.NbrNotes; i++) {
			System.out.print(" Notes [" + i + "] : ");
			E.TabNotes.add(Sc.nextDouble()); // Ajout d'un element dans un Vector
		}

		return (E);

	}

	public double Moyenne() // Calcul de la moyenne d'un eleve
	{
		int i = 0;
		double S = 0;

		while (i < NbrNotes) {
			S += TabNotes.get(i);
			i++;
		}

		return (S / this.NbrNotes);
	}

	public Admissibilite GetMention(double note) // Fixation d'une mention en fonction de la Moyenne
	{
		note = this.Moyenne();

		if (note < 10)
			return Admissibilite.N;
		else if (note >= 10 && note < 12)
			return Admissibilite.P;
		else if (note >= 12 && note < 14)
			return Admissibilite.AB;
		else if (note >= 14 && note < 16)
			return Admissibilite.B;
		else if (note > 16)
			return Admissibilite.TB;
		else
			return Admissibilite.NF;

	}

	public void Afficher() // Affichage de la fiche d'un Eleve
	{
		this.Resultat = GetMention(this.Moyenne()); // Appel de la fct Moyenne() pour obtenir une mention

		System.out.println("  ------ [ Resutats Eleve ] ----- \n");

		System.out.println(" " + this.Nom);
		System.out.println(" [ " + this.Resultat.Mention + " ] ");
		System.out.println(" Moyenne => " + this.Moyenne());
		System.out.println(" Liste des notes Obtenues par l'Eleve : ");

		for (int i = 0; i < NbrNotes; i++)
			System.out.print(" <" + TabNotes.get(i) + "> "); // Lecture d'un element dans un Vector

	}

}

// Définition d'un groupe d'Eleve

class ClassRoom {
	private Integer NbrEleve;
	private Vector<Eleve> TabEleve; // Tableau des Eleves

	// Constructeurs

	public ClassRoom() {

	}

	public ClassRoom(Integer Nbr) {
		NbrEleve = Nbr;
		TabEleve = new Vector<Eleve>(NbrEleve);

	}

	// Methodes

	public void Saisir() // Saisie des éleves
	{
		Scanner Sc = new Scanner(System.in);

		System.out.println(" Nombre d'Eleve : ");
		this.NbrEleve = Sc.nextInt();

		TabEleve = new Vector<Eleve>(this.NbrEleve); // Reinitialisation du Vector TabEleve

		for (int i = 0; i < this.NbrEleve; i++) {
			System.out.print(" -- Eleve [" + i + "] -- \n");
			TabEleve.add(new Eleve().Saisir()); // appel de la methode Saisir() de la classe Eleve
		}

	}

	public void Afficher() // Affichage des Eleves
	{
		System.out.println(" --- Tous Les Eleves --- \n");
		for (int i = 0; i < NbrEleve; i++) {
			System.out.print(TabEleve.get(i).toString()); // Appel de la methode toString() de la class Eleve ( redefinie)
		}
	}

}

public class GestionNotesEleve {

	public static void main(String[] args) {
		Eleve E = new Eleve();

		ClassRoom Rc = new ClassRoom();
		Rc.Saisir();
		Rc.Afficher();

	}

}
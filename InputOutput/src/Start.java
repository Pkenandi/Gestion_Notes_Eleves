import java.io.BufferedReader;
import java.io.IOException;
import java.time.*;
import java.util.*;



class Date
{
	private int Jour;
	private int Mois;
	private int Annee;
	
	public Date(int J, int M, int A)
	{
		Jour = J;
		Mois = M;
		Annee = A;
	}
	
	public Date() 
	{
	
	}
	
	private Object toInstant() 
	{	
		return null;
	}
	
	private long getTime() 
	{
	
		return 0;
	}
	
	public void Saisir_Date()
	{
		Scanner Sc  = new Scanner(System.in);
		
		System.out.print(" Jour : ");
		Jour = Sc.nextInt();
		System.out.print(" Mois : ");
		Mois = Sc.nextInt();
		System.out.print(" Année : ");
		Annee = Sc.nextInt();
		
	}
	
	public void Afficher_Date()
	{
		System.out.println(" " + Jour + " / " + Mois + " / " +  Annee);
	}
	
	public int GetAge()
	{
		LocalDate BD = LocalDate.of(this.Annee, this.Mois, this.Jour);
		LocalDate CurrentDate = LocalDate.now();
		
		Period Age = Period.between(BD, CurrentDate);
		
		return (Age.getYears());
	}

}

class Adresse
{
	private String Ville;
	private String Avenue;
	private int Numero;
	
	public Adresse()
	{
		 
	}
	
	public Adresse(String V, String A, int N)
	{
		
		Ville = V;
		Avenue = A;
		Numero = N;
		
	}
	
public void Saisir_Adresse()
	{
		Scanner Adr = new Scanner(System.in);
		
		System.out.print(" Ville :  ");
		Ville = Adr.nextLine();
		System.out.print(" Avenue :  ");
		Avenue = Adr.nextLine();
		System.out.print(" Numero avenue  :  ");
		Numero = Adr.nextInt();
		
	}
	
	public void Afficher_Adresse()
	{
		System.out.println(" \n à " + Ville + " Avenue " + Avenue + " au N° " + Numero);
	}
	
}

class Personne
{
	protected String Nom;
	protected String Prenom;
	protected Date DateNaiss;
	protected Adresse Adresse_P;
	
	public Personne()
	{
		
	}
	
	public Personne( String N, String P, Date D, Adresse adr )
	{
		Nom = N;
		Prenom = P;
		DateNaiss = new Date();
		DateNaiss = D;
		Adresse_P = new Adresse();
		Adresse_P = adr;
		
	}
	
	public void Saisir()
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.print(" Nom : ");
		Nom = Sc.nextLine();
		System.out.print(" Prenom : ");
		Prenom = Sc.nextLine();
		System.out.println("\n << DATE NAISSANCE >> \n");
		new Date().Saisir_Date();
		System.out.println("\n << ADRESSE >> \n");
		new Adresse().Saisir_Adresse();
		
		System.out.println();
		//Sc.close();
		
	}
	
	public void Afficher()
	{
		System.out.println("\n\n");
		System.out.println(" Nom : " + Nom);
		System.out.println("  Prenom : " + Prenom);
		System.out.print("   Né le ");
		new Date().Afficher_Date();
		System.out.println(" Agé de <" + new Date().GetAge() + "> ");
		System.out.print(" Habite ");
		new Adresse().Afficher_Adresse();
		System.out.print("\n");
		
	}
	
	public void Statut()
	{
		System.out.println(" Une Personne ");
	}
}

class Etudiant extends Personne
{
	private Integer Matricule;
	private String CIN;
	private Integer noteSize;
	private Vector<Integer> Notes ; 
	
	public Etudiant ()
	{
		
	}
	
	public Etudiant(int Mat, String cin, int Size)
	{
		Matricule = Mat;
		CIN = cin;
		noteSize = Size;
		Notes = new Vector<Integer>(noteSize);
		
	}
	
	public void Statut() // Méthode Redéfinie
	{
		System.out.println(" Une Personne Etudiante ");
	}
	
	public void Saisir()
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("   << Information Etudiant >> \n ");
		//new Personne().Saisir();
		System.out.println("  << Renseignement Scolaires >> \n ");
		System.out.print(" Matricule : ");
		//Matricule = Sc.nextInt();
		Sc.nextLine();
		System.out.print(" CIN : ");
		//CIN = Sc.nextLine();
		System.out.print(" Nombre notes obtenue(s) : ");
		noteSize = Sc.nextInt();
		
		Notes = new Vector<Integer>(noteSize);
		
		for( int i = 1; i <= noteSize; i++)
		{
			System.out.print(" Note [" + i + "] : ");
			Notes.add(Sc.nextInt());
		}
		
		System.out.println("\n\n");
	}
	
	public void Afficher()
	{
		int i = 0;
		
		new Personne().Afficher();
		System.out.println(" Matricule : " + Matricule);
		System.out.println(" CIN : " + CIN);
		System.out.println(" Liste des Notes Obtenues : ");
		
			while(i < noteSize)
			{
				System.out.print(" [ " + Notes.get(i) + " ]");
				i++;
			}
			
		System.out.println("\n Moyenne => " + this.GetMoyenne());
		
	}
	
	public double GetMoyenne()
	{
		int i = 0;
		double S = 0;
		
		while(i < noteSize)
		{
			S += Notes.get(i);
			i++;
		}
		
		return (S/this.noteSize);
		
	}
	
}

// Classe Matiere 

class Matiere
{
	private String Nom;
	private double Coeff;
	
	public Matiere()
	{
		
	}
	
	public Matiere( String nom, double coeff)
	{
		Nom = nom;
		Coeff = coeff;
	}
	
	public String toString()
	{
		return(" Matiere : " + Nom + "\n   Coeff : [ " + Coeff + " ] " );
	}
	
	public Matiere Saisir_Matiere()
	{
		Matiere M = new Matiere();
		Scanner Sc = new Scanner(System.in);
		
		System.out.print(" Nom de la matiere : ");
	    M.Nom = Sc.nextLine();
		System.out.print(" Coeff : ");
		M.Coeff = Sc.nextInt();
		
		return (M);
		
	}
	
	public void Afficher_Matiere()
	{
		System.out.println(" <" + Nom + ">  Coeff [" + Coeff + "] ");
	}
}

// Classe Enseignant

class Enseignant extends Personne
{
	private static Integer Matricule;
	private static Integer nombre_Mat;
	private static Vector<Matiere> tab_Mat;
	
	public Enseignant()
	{
		
	}
	
	public Enseignant(Integer Mat, Integer Nbr)
	{
		Matricule = Mat;
		nombre_Mat = Nbr;
		tab_Mat = new Vector<Matiere>(nombre_Mat);
	}
	
	public void Saisir()
	{
		int i = 1;
		Scanner Sc = new Scanner(System.in);
		
		//System.out.println("  << Informations Enseignant >> \n");
		//Personne.Saisir();
		System.out.println("  << Coordonnées Universitaires >> \n");
		System.out.print(" Matricule :  ");
		Matricule = Sc.nextInt();
		System.out.print(" Nombre des matieres : ");
		nombre_Mat = Sc.nextInt();
			
		tab_Mat = new Vector<Matiere>(nombre_Mat);
		while( i <= nombre_Mat)
		{
			tab_Mat.add(new Matiere().Saisir_Matiere());
			i++;
		}
	}
	

	public void Afficher()
	{
		int i = 0, j = 1;
		
		//Personne.Afficher();
		System.out.println(" Matricule : " + Matricule);
		System.out.println(" \nListe des Matieres : ");
		
			while(i < nombre_Mat)
			{
				System.out.println("\n  ------[ " + j +" ]------ ");
				System.out.print("  " + tab_Mat.get(i).toString() + " \n");
				i++;
				j++;
			}
	}
}

public class Start 
{

	public static void main(String[] args) 
	{
		
		Etudiant E = new Etudiant();
		
		E.Saisir();
		
		E.Afficher();
		
	}

}
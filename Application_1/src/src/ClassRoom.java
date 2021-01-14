package src;
import java.util.Scanner;
import java.util.Vector;

// Définition d'un groupe d'Eleve

public class ClassRoom 
{
	private Integer NbrEleve;
	private Vector<Eleve>TabEleve; //Tableau des Eleves
	
	// Constructeurs
	
	public ClassRoom()
	{
	
	}
	
	public ClassRoom(Integer Nbr)
	{
	NbrEleve = Nbr;
	TabEleve = new Vector<Eleve>(NbrEleve);
	
	}
	
	//Methodes
	
	public void Saisir() // Saisie des éleves
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" Nombre d'Eleve : ");
		this.NbrEleve = Sc.nextInt();
		
		TabEleve = new Vector<Eleve>(this.NbrEleve); //Reinitialisation du Vector TabEleve
		
		for(int i = 0; i < this.NbrEleve; i++)
		{
			System.out.print(" -- Eleve [" + i + "] -- \n");
			TabEleve.add(new Eleve().Saisir()); // appel de la methode Saisir() de la classe Eleve
		}
	
	}
	
	public void Afficher() // Affichage des Eleves
	{
		System.out.println(" --- Tous Les Eleves --- \n");
		for( int i = 0; i < NbrEleve; i++)
		{
			System.out.print(TabEleve.get(i).toString()); //Appel de la methode toString() de la class Eleve ( redefinie)
		}
	}

}
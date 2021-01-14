import java.util.Scanner;

public class Cercle 
{

	private double Rayon;

	// Constructeurs

	public Cercle() 
	{

	}

	public String toString() // Redefinition de la methode toString
	{
		return (" Le rayon vaut : " + Rayon);
	}

	public Cercle Saisir() // Saisie du Rayon
	{
		Scanner Sc = new Scanner(System.in);
		Cercle C = new Cercle();

		System.out.print(" Rayon :  ");
		C.Rayon = Sc.nextDouble();

		return (C);

	}

	public double CalculerSurface() // Calcul de la surface d'un Cercle
	{
		return ((Math.PI) * (Math.pow(Rayon, 2)));
	}
}

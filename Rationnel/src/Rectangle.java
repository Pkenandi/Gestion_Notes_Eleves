package TP2;

import java.util.Scanner;


// ----[ Classe Rectangle ]----

public class Rectangle 
{

	private double Hauteur;
	private double Largeur;

	// Constructeurs

	public Rectangle() 
	{

	}

	public Rectangle(double H, double L) 
	{

		Hauteur = H;
		Largeur = L;

	}

	public Rectangle Saisir() // Saisie des Coordonnees d'un Rectangle
	{
		Scanner Sc = new Scanner(System.in);
		Rectangle R = new Rectangle();

		System.out.print(" Hauteur : ");
		R.Hauteur = Sc.nextDouble();
		System.out.print(" Largeur : ");
		R.Largeur = Sc.nextDouble();

		return (R);

	}

	public double CalculerSurface() // Calcul de la surface d'un Rectangle
	{
		return (Hauteur * Largeur);
	}

}

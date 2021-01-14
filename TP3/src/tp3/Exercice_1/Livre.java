package tp3.Exercice_1;

import java.util.*;

public class Livre extends Documents
{
	protected String auteur;
	protected Integer nombrePage;


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public Integer getNombrePage() {
		return nombrePage;
	}


	public void setNombrePage(Integer nombrePage) {
		this.nombrePage = nombrePage;
	}
	
	public Livre()
	{
		
	}
	
	public Livre(Integer num, String titre,String auteur, Integer nbr) throws NumEngInvalidException 
	{
		super(num,titre);
		this.nombrePage = nbr;
		this.auteur = auteur;
	}

	@Override
	public String toString() 
	{
		return " \n Livre <" + Titre +">\n      [ Auteur = " + auteur + ", Nombre des Pages = " + nombrePage + " Numero enregistrement : "+ NumEng +" ]";
	}
	
	public Documents Saisir()
	{
		System.out.println(" ----- [ Livre ] ------ \n");
		
		super.Saisir();
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.print(" Nom de l'auteur : ");
		this.auteur = Sc.nextLine();
		System.out.print(" Nombre des pages : ");
		this.nombrePage = Sc.nextInt();
		
		try {
			
			return (new Livre(super.NumEng, super.Titre, this.auteur, this.nombrePage));
			
		} catch (NumEngInvalidException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}

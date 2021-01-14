package tp3.Exercice_1;

import java.util.Scanner;

public class Revues extends Documents
{
	
	private Integer Mois;
	private Integer Annee;
	
	public Integer getMois() {
		return Mois;
	}

	public void setMois(Integer mois) {
		Mois = mois;
	}

	public Integer getAnnee() {
		return Annee;
	}

	public void setAnnee(Integer annee) {
		Annee = annee;
	}

	public Revues()
	{
		
	}
	
	public Revues( Integer num,String titre, Integer M, Integer A) throws NumEngInvalidException 
	{
		super(num, titre);
		this.Mois = M;
		this.Annee = A;
	}

	@Override
	public String toString() 
	{
		return "\n Revues <" + Titre +">\n     [ Mois = " + Mois + ", Annee = " + Annee +" Numero enregistrement =  "+ NumEng + " ]";
	}
	
	public Documents Saisir()
	{
		System.out.println(" ----- [ Revues ] ------ \n");
		
		super.Saisir();
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" Mois :  ");
	    this.Mois = Sc.nextInt();
		System.out.println(" Année :  ");
		Sc.nextLine();
	    this.Annee = Sc.nextInt();
	    
	    try {
	    	
			return new Revues(super.NumEng,super.Titre,this.Mois, this.Annee);
			
		} catch (NumEngInvalidException e) {

			e.printStackTrace();
		}
	    
	    return null;
	}

}

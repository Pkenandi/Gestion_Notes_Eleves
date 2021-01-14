package tp3.Exercice_1;

import java.util.*;

public class Manuels extends Livre
{
	private Integer nivScolaire;

	public Integer getNivScolaire() {
		return nivScolaire;
	}

	public void setNivScolaire(Integer nivScolaire) {
		this.nivScolaire = nivScolaire;
	}
	
	public Manuels()
	{
		
	}
	
	public Manuels(Integer num, String titre,String auteur, Integer nbr, Integer ns ) throws NumEngInvalidException 
	{
		super(num, titre, auteur, nbr);
		this.nivScolaire = ns;
		
	}

	@Override
	public String toString() {
		return "\n  Manuels <" + Titre +">\n     [ Niveau Scolaire = " + nivScolaire + " Numero d'enregistrement = " + super.NumEng + " Auteur =  " + super.auteur + " Nombre page = " + super.nombrePage + " ]";
	}
	
	public Documents Saisir()
	{
		System.out.println(" ----- [ Manuels ] ------ \n");
		super.Saisir();
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Niveau scolaire :  ");
	    this.nivScolaire = Sc.nextInt();
	    
	    try {
	    	
			return new Manuels(super.NumEng, super.Titre, super.auteur, super.nombrePage , nivScolaire);
			
		} catch (NumEngInvalidException e) {
			
			e.printStackTrace();
		}
	    
	    return null;
	}
}

package mag;
import java.lang.*;
import java.util.*;

class CatIncorrectException extends Exception
{
	public CatIncorrectException()
	{
		
	}
	
	public CatIncorrectException(String E) 
	{
		super(E);
	}
	
	private static final long serialVersionUID = 1L;
	
}

enum Categorie
{
	cat_1("A"), cat_2("A+"), cat_3("A++");
	
	String Cat;
	
	Categorie(String C)
	{
		Cat = C;
	}
	
	public String getCat()
	{
		return Cat;
	}
	
	public String toString()
	{
		return Cat;
	}
}

public class Produit_Bio extends Produit
{
	private String Categorie;
	
	public Produit_Bio() 
	{
		this.Categorie = "";
	
	}
	
	public Produit_Bio(String D, double P, String C) throws CatIncorrectException
	{
		super(D,P);
		super.TVA = 0.06;
		
		if( C == "A")
			this.Categorie =mag.Categorie.cat_1.toString();
		else if(C == "A+")
			this.Categorie = mag.Categorie.cat_2.toString();
		else if(C == "A++")
			this.Categorie = mag.Categorie.cat_3.toString();
		else throw new CatIncorrectException(" Categorie Incorrecte !! ");
	
	}
	
	double getPrixTTC()
	{
		return super.PrixHT * (1 + (TVA/100));
	}
	
	public String toString()
	{
		return " < Produit Bio >\n Designation : " + this.Design + "\n  Prix Hors Taxe : " + this.getPrixTTC() + "\n    Categorie : " + Categorie ;
	}
}

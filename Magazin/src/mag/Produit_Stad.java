package mag;

public class Produit_Stad extends Produit 
{
	
	public Produit_Stad() 
	{
		
	}
	
	public Produit_Stad(String D, double prix)
	{
		super(D,prix);
		super.TVA = 0.18;
	}
	
	double getPrixTTC()
	{
		return super.PrixHT * (1 + (TVA/100));
	}
	
	public String toString()
	{
		return "< Produit standard > \n Designation : " + this.Design + "\n  Prix Hors Taxe : " + this.getPrixTTC();
	}

}

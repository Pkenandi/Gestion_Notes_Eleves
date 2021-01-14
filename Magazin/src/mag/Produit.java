package mag;

public abstract class Produit 
{
	
	protected String Design;
	protected double PrixHT;
	protected double TVA;
	
	public String getDesign() {
		return Design;
	}
	
	public void setDesign(String design) {
		Design = design;
	}
	
	public double getPrixHT() {
		return PrixHT;
	}
	
	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}
	
	public Produit()
	{
		
	}
	
	public Produit(String D, double prix)
	{
		Design = D;
		PrixHT = prix;
	}

	double	 getPrixTTC()
	{
		return this.PrixHT * ( 1 + (TVA/100)); 
	}

}
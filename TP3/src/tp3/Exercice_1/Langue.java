package tp3.Exercice_1;

public enum Langue {
	
	Ang(" Anglais "), Fr(" Fran�ais "), All(" Allemand ");
	
	String langue;
	
	public String getlangue()
	{
		return this.langue;
	}
	
	public String toString()
	{
		return langue;
	}
	
	Langue( String L )
	{
		langue = L;
	}
}

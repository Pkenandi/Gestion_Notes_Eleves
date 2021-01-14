package tp3.Exercice_1;

import java.util.Scanner;

class LangueInvalidException extends Exception
{
	
	public LangueInvalidException()
	{
		
	}
	
	public LangueInvalidException(String message)
	{
		super(message);
	}
	
	private static final long serialVersionUID = 1L;
	
}

public class Dictionnaires extends Documents 
{
	private String langue; 
	
	// Accesseurs 
	public String getlangue()
	{
		return this.langue;
	}
	
	public void setlangue(String L)
	{
		langue = L;
	}
	
	public Dictionnaires()
	{
		
	}

	public Dictionnaires(Integer num, String titre, String Lg) throws NumEngInvalidException
	{
		
		super(num, titre);
		
		try {
			
			switch(Lg)
			{
			case ("Fr"):
			{
				this.langue = Langue.Fr.getlangue();
				break;
			}
			
			case ("Ang"):
			{
				this.langue = Langue.Ang.getlangue();
				break;
			}
			
			case ("All"):
			{
				this.langue = Langue.All.getlangue();
				break;
			}
			
			default :
				throw new LangueInvalidException(" Language not Found !!");
			}
			
			
		} catch (LangueInvalidException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() 
	{
		return " \n Dictionnaires <" + Titre +">\n      [ Langue = " + langue + ", Numero enregistrement = " + NumEng + " ]";
	}
	
	public Documents Saisir() 
	{
		System.out.println(" ------ [ Dictionnaire ] ----- \n");
		Langue L = null;
		
		super.Saisir();
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Langue ( Fr | Ang | All ) : ");
		String Lg = Sc.nextLine();
		
		try {
			
			switch(Lg)
			{
			case ("Fr"):
			{
				this.langue = L.Fr.getlangue();
				break;
			}
			
			case ("Ang"):
			{
				this.langue = L.Ang.getlangue();
				break;
			}
			
			case ("All"):
			{
				this.langue = L.All.getlangue();
				break;
			}
			
			default :
				throw new LangueInvalidException(" Language not Found !!");
			}
			
			return (new Dictionnaires(super.NumEng, super.Titre, langue));
			
		} catch (NumEngInvalidException | LangueInvalidException e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
}
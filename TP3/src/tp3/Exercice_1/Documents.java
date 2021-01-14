package tp3.Exercice_1;

import java.util.*;

class NumEngInvalidException extends Exception
{

	private static final long serialVersionUID = 1L;

	public NumEngInvalidException()
	{
		
	}
	
	public NumEngInvalidException(String message)
	{
		super(message);
	}
	
	
}

public class Documents 
{
	protected Integer NumEng;
	protected String Titre;

	public Integer getNumEng() {
		return NumEng;
	}

	public void setNumEng(Integer numEng) {
		NumEng = numEng;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}
	
	public Documents()
	{
		
	}
	
	public Documents(Integer num, String titre) throws NumEngInvalidException
	{
		this.Titre = titre;
		if(num == (Integer)num)
			this.NumEng = num;
		else
			throw new NumEngInvalidException(" Not an Integer !! ");
	}
	
	@Override
	public boolean equals(Object O)
	{
		if(O == null)
			return false;
		
		if(O == this)
			return true;
		
		Documents doc = (Documents)O;
		
		return (this.getNumEng() == doc.getNumEng() && this.getTitre().equalsIgnoreCase(doc.getTitre()));
	}
	
	@Override
	public String toString() 
	{
		return "\n Documents \n     [ Numero Enregistrement = " + NumEng + ", Titre = " + Titre + " ] ";
	}

	public Documents Saisir() 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("\n Numero enregistrement : ");
		this.NumEng = Sc.nextInt();
		System.out.println(" Titre : ");
		Sc.nextLine();
		this.Titre = Sc.nextLine();
		
		try {
			
			return (new Documents(NumEng, Titre));
			
		} catch (NumEngInvalidException p) {
	
			p.printStackTrace();
			
		}
		
		return null;
	}
	
}
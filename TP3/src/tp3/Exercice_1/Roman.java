package tp3.Exercice_1;

import java.util.*;

class PrixInvalidException extends Exception
{
	public PrixInvalidException()
	{
		
	}
	
	public PrixInvalidException(String message)
	{
		super(message);
	}

	private static final long serialVersionUID = 1L;
	
}

public class Roman extends Livre
{
	private final Integer Goncourt = 250;
	private final Integer Medicis = 500;
	private final Integer Interallie = 700;
	private Integer PrixLitt;

	public Roman()
	{
		
	}
	
	public Roman(Integer num, String titre,String auteur, Integer nbr, Integer P) throws PrixInvalidException, NumEngInvalidException  
	{
		super(num, titre, auteur, nbr);
		PrixLitt = P;
		
		switch(PrixLitt)
		{
		case 250 : 
		{
			PrixLitt = Integer.valueOf(Goncourt);
			break;
		}
			
		case 500 :
		{
			PrixLitt = Integer.valueOf(Medicis);
			break;
		}
			
		case 700 :
		{
			PrixLitt = Integer.valueOf(Interallie);
			break;
		}
			
		default : 
			throw new PrixInvalidException(" Prix invalide !!! \n Soit Goncourt  = 250 \n  Medicis = 500 \n    Interallis = 700  ");
			
		}
		
	}

	public Integer getPrixLitt() {
		return PrixLitt;
	}

	public void setPrixLitt(Integer P) 
	{
		PrixLitt = P;
	}

	@Override
	public String toString() 
	{
		return "\n Roman <"+ Titre + ">\n     [ Prix litteraire = " + PrixLitt + ", Numero enregistrement = " + NumEng + "]";
	}
	
	public Documents Saisir() 
	{
		System.out.println(" ----- [ Roman ] ------ \n");
		
		super.Saisir();
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" prix litteraire ( ex : Goncourt(250), Medicis(500), Interallie(700), ... : ");
		this.PrixLitt = Sc.nextInt();
		
		try {
			
			return new Roman(super.NumEng, super.Titre, super.auteur, super.nombrePage, PrixLitt);
			
		} catch (PrixInvalidException | NumEngInvalidException p) {

			p.printStackTrace();
		}
		
		return null;
	}
	
}

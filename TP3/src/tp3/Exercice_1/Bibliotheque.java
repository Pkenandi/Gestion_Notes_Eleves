package tp3.Exercice_1;

import java.util.*;

public class Bibliotheque 
{
	protected Integer Nbr;
	protected Vector<Documents> Docs;
	
	public Bibliotheque() {
		
	}
	
	public Bibliotheque(Integer size)
	{
		
		this.Nbr = size;
		Docs = new Vector<Documents>(this.Nbr);
		
	}
	
	public void Saisir()
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.print(" Nombre d'ouvrage : ");
		this.Nbr = Sc.nextInt();
		
		Docs = new Vector<Documents>(Nbr);
		
		for(int i = 0; i < Nbr; i++)
		{
			System.out.println(" ----- Document [" + i + "] ----- \n");
			Docs.add(new Documents().Saisir());
		}
	}
	
	public void Afficher()
	{
		System.out.println(" ---- [ Affichage des ouvrages ] ---- \n");
		
		if(Docs.isEmpty())
		{
			System.out.println(" La bibliotheque est vide !! ");
		}else
		{
			ListIterator<Documents> Iter = Docs.listIterator();
			while(Iter.hasNext())
				System.out.println( Iter.next());
		}
		
	}
	
	Documents document( int index )
	{
		return Docs.get(index);
	}
	
	public boolean Ajouter( Documents doc)
	{
		if(!(doc.equals(null)) || Docs.contains(doc))
		{
			Docs.add(doc);
			return true;
		}else
			return false;
	}
	
	public boolean Supprimer(Documents doc)
	{
		
		if(!(doc.equals(null)) || Docs.contains(doc))
		{
			Docs.remove(doc);
			return true;
		}else
		{
			return false;
		}
	}
	
	public void AfficherAuteurs()
	{
		for(int i = 0; i < this.Nbr; i++)
		{
			if(Docs.elementAt(i) instanceof Livre)
			{
				System.out.println(" \n " + ((Livre)Docs.elementAt(i)).getAuteur());
			}
		}
	}
	
}

package tp3.Exercice_1;

public class Livrotheque extends Bibliotheque{

	public Livrotheque() 
	{
		
	}
	
	public Livrotheque(int size)
	{
		super(size);
	}
	
	public boolean Ajouter(Documents doc)
	{
		if(doc instanceof Livre)
			return super.Ajouter(doc);
		else
			return false;
	}
	
	public Livre book( Integer index)
	{
		return (Livre) Docs.get(index);
	}
	
	public void AfficherAuteurs()
	{
		for(int i = 0; i < Nbr; i++)
		{
			System.out.println("\n " + ((Livre)Docs.get(i)).getAuteur());
		}
	}
	
	public boolean Ajouter(Livre doc)
	{
		return super.Ajouter(doc);
	}

}

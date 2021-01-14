package src;

enum Admissibilite //Definition de L'enumeration des Mentions
{
	N("Non Admis"), 
	P(" Passable"), 
	AB("Assez Bien"),
	B("Bien"),
	TB(" Tres Bien"),
	NF(" Not Found !!");
	
	final String Mention; 
	
	Admissibilite(String M) //Constructeur pour initialiser les attributs
	{
		Mention = M;
	}
	
}


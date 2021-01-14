
import java.util.Scanner;
import java.util.Vector;

// Exercice1

class Rationnel {

	private Integer num;
	private Integer deno;

	// Accesseurs

	public Integer getnum() 
	{
		return this.num;
	}

	public void setnum(Integer N) 
	{
		this.num = N;
	}

	public Integer getdeno() 
	{
		return this.deno;
	}

	public void setdeno(Integer D) 
	{
		this.deno = D;
	}

	// Constructeur

	public Rationnel() 
	{

	}

	// Methodes

	public void Saisie_Fraction() // Saisie des num et deno
	{
		Scanner Sc = new Scanner(System.in);

		System.out.print(" Numerateur : ");
		this.num = Sc.nextInt();
		System.out.print(" Denominateur : ");
		this.deno = Sc.nextInt();

	}

	public void Affichage_Fraction() // Affichage de Num et Deno
	{
		System.out.print(" \n    " + this.num + "/" + this.deno);
	}

	public String toString() // Redefinition de la methode toString()
	{
		return (" " + this.num + "/" + this.deno);
	}

	public Rationnel mult(Rationnel R) // Methode de Multiplication
	{
		Rationnel T = new Rationnel();
		
		T.num = (R.num * this.num);
		T.deno = (R.deno * this.deno);

		 // Appel de la methode de simplication pour obtenir une fraction elementaire
		
		return (T.Simplifier(T.num, T.deno));
	}

	public Rationnel Add(Rationnel R) // Methode d'Addition
	{
		Rationnel T = new Rationnel();
		
		R.num = ((this.num * R.deno) + (R.num * this.deno));
		R.deno = (R.deno * this.deno);

		T = Simplifier(R.num, R.deno); // Appel de la methode de simplication pour obtenir une fraction elementaire

		return (T);
	}

	public static int pgcd(int Num, int deno) // Calcul du PGCD
	{
		if (deno == 0) {
			return Num;
		} else {
			return pgcd(deno, Num % deno);
		}
	}

	public Rationnel Simplifier(int Num, int Deno) // Methode de Simplification
	{
		Rationnel R = new Rationnel();
		int Smp = pgcd(Num, Deno);

		R.num = Num / Smp;
		R.deno = Deno / Smp;

		return (R);

	}
}

// Class Main

class TestRationnel
{
	public static void main(  String [] args)
	{

		Rationnel R1 = new Rationnel();
		Rationnel R2 = new Rationnel();
		//Rationnel R = new Rationnel();
		
		R1.Saisie_Fraction();
		R2.Saisie_Fraction();
		
		System.out.println(R1.Add(R2));
		System.out.println(R1.mult(R2));
		
		
		
	}
}

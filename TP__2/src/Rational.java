import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.lang.*;

//			----[ PARTIE I : Exercice 1 ]----

class Test {

	private Integer num;
	private Integer deno;

	// Accesseurs

	public Integer getnum() {
		return this.num;
	}

	public void setnum(Integer N) {
		this.num = N;
	}

	public Integer getdeno() {
		return this.deno;
	}

	public void setdeno(Integer D) {
		this.deno = D;
	}

	// Constructeur

	public Test() {

	}

	// Methodes

	public void InputFraction() // Saisie des num et deno
	{
		Scanner Sc = new Scanner(System.in);

		System.out.print(" Numerateur : ");
		this.num = Sc.nextInt();
		System.out.print(" Denominateur : ");
		this.deno = Sc.nextInt();

	}

	public void Show_Fraction() // Affichage de Num et Deno
	{
		System.out.print(" \n    " + this.num + "/" + this.deno);
	}

	public String toString() // Redefinition de la methode toString()
	{
		return (" " + this.num + "/" + this.deno);
	}

	public Test mult(Test R) // Methode de Multiplication
	{
		R.num = (R.num * this.num);
		R.deno = (R.deno * this.deno);

		Test T = Simplifier(R.num, R.deno); // Appel de la methode de simplication pour obtenir une fraction elementaire

		return (T);
	}

	public Test Add(Test R) // Methode d'Addition
	{
		R.num = ((this.num * R.deno) + (R.num * this.deno));
		R.deno = (R.deno * this.deno);

		Test T = Simplifier(R.num, R.deno); // Appel de la methode de simplication pour obtenir une fraction elementaire

		return (T);
	}

	public int pgcd(int Num, int deno) // Calcul du PGCD
	{
		if (deno == 0) {
			return Num;
		} else {
			return pgcd(deno, num % deno);
		}
	}

	public Test Simplifier(int Num, int Deno) // Methode de Simplication
	{
		Test R = new Test();
		int Smp = pgcd(Num, Deno);

		R.num = Num / Smp;
		R.deno = Deno / Smp;

		return (R);

	}

}

// ----[ Exercice 2 ]----

// ----[ Classe Rectangle ]----

class Rectangle {

	private double Hauteur;
	private double Largeur;

	// Constructeurs

	public Rectangle() {

	}

	public Rectangle(double H, double L) {

		Hauteur = H;
		Largeur = L;

	}

	public Rectangle Saisir() // Saisie des Coordonn�es
	{
		Scanner Sc = new Scanner(System.in);
		Rectangle R = new Rectangle();

		System.out.print(" Hauteur : ");
		R.Hauteur = Sc.nextDouble();
		System.out.print(" Largeur : ");
		R.Largeur = Sc.nextDouble();

		return (R);

	}

	public double CalculerSurface() // Calcul de la surface d'un Rectangle
	{
		return (Hauteur * Largeur);
	}

}

// ---[ Classe Cercle ]---

class Cercle {

	private double Rayon;

	// Constructeurs

	public Cercle() {

	}

	public String toString() // Redefinition de la methode toString
	{
		return (" Le rayon vaut : " + Rayon);
	}

	public Cercle Saisir() // Saisie du Rayon
	{
		Scanner Sc = new Scanner(System.in);
		Cercle C = new Cercle();

		System.out.print(" Rayon :  ");
		C.Rayon = Sc.nextDouble();

		return (C);

	}

	public double CalculerSurface() // Calcul de la surface d'un Cercle
	{
		return ((Math.PI) * (Math.pow(Rayon, 2)));
	}
}

// ----[ Classe Terrain ]----

class Terrain {
	private Integer NbrRec;
	private Vector<Rectangle> Rec;
	private Integer NbrCrl;
	private Vector<Cercle> Crl;

	// Constructeurs

	public Terrain() {

	}

	public Terrain(Integer R, Integer C) {
		NbrRec = R;
		Rec = new Vector<Rectangle>(NbrRec);

		NbrCrl = C;
		Crl = new Vector<Cercle>(NbrCrl);
	}

	public void Saisir() // Saisie du nombre des Rectangles et Cercles
	{
		Scanner Sc = new Scanner(System.in);
		int i = 0, j = 0;

		System.out.print(" \n [#] Nombre de Rectangle : ");
		NbrRec = Sc.nextInt();

		// Saisie coordonees Rectangle

		Rec = new Vector<Rectangle>(NbrRec); // Reinitialisation du vector Rec
		System.out.println(" --- Rectangle ---- \n");
		while (i < NbrRec) {
			Rec.add(new Rectangle().Saisir()); // Appel de la methode Saisir() de la classe Rectangle
			System.out.println();
			i++;
		}

		System.out.print("\n [#] Nombre de Cercle : ");
		NbrCrl = Sc.nextInt();

		// Saisie coordonees Cercle

		Crl = new Vector<Cercle>(NbrCrl); // Reinitialisation du vector Crl
		System.out.println("\n --- Cercle ---- ");
		while (j < NbrCrl) {
			Crl.add(new Cercle().Saisir()); // Appel de la methode Saisir() de la classe Cercle
			j++;
		}

	}

	public void CalculerSurfaceTotale() // Calcul de la Surface Totale
	{
		int i = 0, j = 0; // Iterateurs pour ( Rsp ) Rec et Crl
		double Sr = 0, Sc = 0; // Variable pour stock� la Somme de (Rsp) Rec et Crl

		while (i < NbrRec) {
			Sr += this.Rec.get(i).CalculerSurface(); // Appel de la methode CalculerSurface() de la classe Rectangle
			i++;
		}

		while (j < NbrCrl) {
			Sc += this.Crl.get(j).CalculerSurface(); // Appel de la methode CalculerSurface() de la classe Cercle
			j++;
		}

		System.out.println(" La Surface Totale du Rectangle vaut " + Sr);
		System.out.println(" La Surface Totale du Cercle vaut : " + Sc);
		System.out.println(" La Surface Totale du Terrain vaut " + (Sr + Sc));

	}

}

// ----[ PARTIE II : Exercice 3 ]----

class TestChaines {
	// Methodes

	public String integerTostring(Integer X) // Conversion d'un Integer(int) en String
	{
		return (Integer.toString(X));
	}

	public Integer stringTointeger(String X) // Conversion d'un String en Integer
	{
		return (Integer.parseInt(X));
	}

	public Double stringTofloat(String X) // Conversion d'un String en Float ou double
	{
		return (Double.parseDouble(X));
	}

	public String trimAnduppercase(String X) // Suppression d'espace et mise en Maj des Caracteres
	{
		String Nc = X.trim();

		return (Nc.toUpperCase());
	}

	public void StartWith(String S1, String S2) // Verification
	{
		char c1 = S1.charAt(0); // Stockage du 1er caractere de S1
		char c2 = S2.charAt(0); // Stockage du 1er caractere de S2

		if (c1 == c2) {
			System.out.println(" Elles commencent par le meme caractere ! ");
		} else {
			System.out.println(" Elles ne commencent pas par le meme caractere ! ");
		}
	}

	public void Comparaison1(String S1, String S2) {
		System.out.println(" S1 == S2 => " + S1 == S2);
		System.out.println(" S1.equals(S2) => " + S1.equals(S2));
		System.out.println(" S1.compareTo(S2) => " + S1.compareTo(S2));
		System.out.println(" S1.compareTolgnoreCase(S2) => " + S1.compareToIgnoreCase(S2));

	}

	public void Comparaison2(String S1, String S2) {

		if (S1.indexOf(S2) > 0) // ou bien S1.contains(S2) => retourne un boolean
		{
			System.out.println(" <" + S1 + "> Contient <" + S2 + "> ");
		} else {
			System.out.println(" <" + S1 + "> Ne contient pas <" + S2 + "> ");
		}

		if (S1.startsWith(S2))
			System.out.println(" <" + S1 + "> Commence par <" + S2 + ">");
		else
			System.out.println(" <" + S1 + "> Ne Commence pas par <" + S2 + ">");

		if (S1.endsWith(S2))
			System.out.println(" <" + S1 + ">  Se Termine Par <" + S2 + "> ");
		else
			System.out.println(" <" + S1 + "> Ne se termine pas par <" + S2 + "> ");

	}

	public String SubString(String S1, String S2) {
		if (S1.contains(S2)) {
			return S1.replace(S2, "");
		} else
			return S1;

	}
}

// -----[ Exercice 4 ]-----

class IntervalTime {

	public void Millis() {
		System.out.println(" Temps ecouler depuis 1 Jan 1970 => " + System.currentTimeMillis());
	}

	public void byDate() {

		System.out.println(" On est le : " + LocalDate.now());
	}

	public void byDateFormatter() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

		Date date = new Date(System.currentTimeMillis());

		System.out.println(formatter.format(date));

	}
}

// -------[ Classe de la methode Main ]------

public class Rational {
	public static void main(String[] args) {
		System.out.println(" 		---[ TP2 ]---   ");

		Terrain T = new Terrain();

		T.Saisir();

		T.CalculerSurfaceTotale();

	}
}
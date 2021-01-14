package mag;

public class Test {

	public static void main(String[] args) 
	{
		
		Produit Ps = new Produit_Stad(" PQ", 500);
		System.out.println(Ps.toString());
		
		Produit Pb;
		try {
			
			Pb = new Produit_Bio(" Pate complete",750,"Ab");
			System.out.println(Pb.toString());
			
		} catch (CatIncorrectException e) {

			e.printStackTrace();
		}
		
	}

}

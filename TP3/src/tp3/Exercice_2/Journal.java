package tp3.Exercice_2;

import java.util.*;
import java.text.*;

public class Journal extends ArrayList<Journal.Evenement>
{
	private static final long serialVersionUID = 1L;

	static String pattern = "dd MMMMM yyyy HH:mm:ss";

	private static DateFormat DF = new SimpleDateFormat(pattern);
	
	class Evenement
	{
		public Date date;
		public String desc;
		
		Evenement(Date D, String Desc)
		{
			this.date = D;
			this.desc = Desc;
		}
		
		public String toString()
		{
			return DF.format(date) + "   " + this.desc;
		}
	}
	
		public void Ajouter()
		{
			
			Date date = new Date();
			//add(new Evenement(date, desc));
			
		}
		
		public String toString()
		{
			return super.toString();
		}
		
		

	public Journal() {
		
	}

}

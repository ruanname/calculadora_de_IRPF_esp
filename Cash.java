
public class Cash { 
	public float sueldo; 
	public float pagas;  
	public float tasa; 
	
	public int calcTasa(sueldo, pagas) { 
		int taxa; 
		
		if ((sueldo * pagas >= 0) && (sueldo * pagas <= 12450)) {
			return taxa = 19;
		} else if ((sueldo * pagas > 12450) && (sueldo * pagas <= 20200)) {
			return taxa = 24;
		} else if ((sueldo * pagas > 20200) && (sueldo * pagas <= 35200)) { 
			return taxa = 30;
		} else if ((sueldo * pagas > 35200) && (sueldo * pagas <= 60000)) {
			return taxa = 37;
		} else if (sueldo * pagas > 60000) {
			return taxa = 45;
		}
		
		return tasa = taxa
	}

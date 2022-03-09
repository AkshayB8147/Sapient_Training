package question12;

public class GetCity {
	public String getCityByCode(int number) {
		switch(number) {
		case 1: return "DELHI";
		case 2: return "NOIDA";
		case 3: return "GUARGAON";
		case 4: return "BANGLORE";
		default: return "INVALIDCODE";
		}
	}
	
}

package question12;

public class GetCityMain {
	public static void main(String[] args) {
		GetCity getCity=new GetCity();
		System.out.println(getCity.getCityByCode(4));
		System.out.println(getCity.getCityByCode(3));
		System.out.println(getCity.getCityByCode(2));
		System.out.println(getCity.getCityByCode(1));
		System.out.println(getCity.getCityByCode(10));
	}
}

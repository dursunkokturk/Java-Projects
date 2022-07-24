package string_type_variables;

public class Main {

	public static void main(String[] args) {
		String city1 = "Ankara";
		String city2 = "Ýstanbul";
		
		city1 = city2;
		city2 = "Ýzmir";
		System.out.println(city1);
	}
}
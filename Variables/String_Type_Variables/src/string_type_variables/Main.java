package string_type_variables;

public class Main {

	public static void main(String[] args) {
		String city1 = "Ankara";
		String city2 = "�stanbul";
		
		city1 = city2;
		city2 = "�zmir";
		System.out.println(city1);
	}
}
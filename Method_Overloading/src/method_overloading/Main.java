package method_overloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println("2 Parameters Total Operarion : " + fourOperations.total(2,3));
		System.out.println("3 Parameters Total Operarion : " + fourOperations.total(2,3,7));
	}
}
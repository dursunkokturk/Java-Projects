package parameterized_functions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = total(5,7);
		System.out.println(total);
		
		String newMessage = cityGive();
		System.out.println(newMessage);
	}
	
	public static int total(int number1,int number2) {
		return number1 + number2;
	}
	
	public static String cityGive() {
		return "Ankara";
	}

}
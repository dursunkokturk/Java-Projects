package for_loop_2;

public class Main {

	public static void main(String[] args) {
		String[] credits = {
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi"
				};
		
		for (int i=0 ; i <credits.length; i++) {
			System.out.println(credits[i]);
		}
	}
}
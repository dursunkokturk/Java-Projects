
public class Main {

	public static void main(String[] args) {
		double dolarYesterday = 8.15;
		double dolarToday = 8.10;
		int maturity = 36;
		boolean decrease = false;
								
		if (dolarToday<dolarYesterday) {
			System.out.println("Dolar Düþtü Sembolü");
		}else if (dolarToday>dolarYesterday) {
			System.out.println("Dolar Yükseldi Sembolü");
		}else {
			System.out.println("Dolar Eþittir Sembolü");
		}
	}
}
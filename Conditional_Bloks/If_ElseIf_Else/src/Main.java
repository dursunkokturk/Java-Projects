
public class Main {

	public static void main(String[] args) {
		double dolarYesterday = 8.15;
		double dolarToday = 8.10;
		int maturity = 36;
		boolean decrease = false;
								
		if (dolarToday<dolarYesterday) {
			System.out.println("Dolar D��t� Sembol�");
		}else if (dolarToday>dolarYesterday) {
			System.out.println("Dolar Y�kseldi Sembol�");
		}else {
			System.out.println("Dolar E�ittir Sembol�");
		}
	}
}
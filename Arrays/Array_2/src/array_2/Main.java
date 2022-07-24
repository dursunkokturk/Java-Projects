package array_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList2 = {1.2,1.3,4.3,5.6};
		
		double total2 = 0;
		
		// Array Ýçindeki 0 nolu Ýndex En Büyük Deðer Kabul Ediliyor 
		double max = myList2[0]; 
		
		for (double numbers2:myList2) {
			if (max<numbers2) {
				max = numbers2;
			}
			total2 = total2 + numbers2;
			System.out.println(numbers2);
		}
		System.out.println("Total: " + total2);
		System.out.println("More Number: " + max);
	}
}
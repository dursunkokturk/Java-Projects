package array_type_variables;

public class Main {

	public static void main(String[] args) {
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0] = 100;
		
		System.out.println(numbers1[0]);
	}
}
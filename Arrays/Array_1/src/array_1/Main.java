package array_1;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[4];
		students[0] = "Dursun";
		students[1] = "Hakan";
		students[2] = "Sefa";
		students[3] = "Mehmet";
		
		for (int i = 0 ; i<students.length ; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		for (String student : students) {
			System.out.println(student);
		}
	}
}
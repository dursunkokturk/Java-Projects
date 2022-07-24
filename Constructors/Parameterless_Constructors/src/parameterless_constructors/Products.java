package parameterless_constructors;

public class Products {
	int id; 
	String name;
	double unitPrice;
	String detail;
	
	public Products() {
		System.out.println("I Studied");
	}
	
	public Products(int id, String name, double unitPrice, String detail) {
		
		this();
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
}
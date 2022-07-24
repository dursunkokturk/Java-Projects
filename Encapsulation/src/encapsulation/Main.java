package encapsulation;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}
}
package parameterless_constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products product1 = new Products();
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		Products product2 = new Products();
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";

		Products product3 = new Products();
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 8000;
		product3.detail = "16 GB Ram";
						
		Products[] products = {product1,product2,product3};
		
		for (Products product : products) {
			System.out.println(product.name);
		}
						
		System.out.println(products.length);
		
		Categories category1 = new Categories();
		category1.id = 1;
		category1.name = "Computer";
						
		Categories category2 = new Categories();
		category2.id = 2;
		category2.name = "Home & Garden";
		
		ProductManager productManager = new ProductManager();
		//ProductsManager productsManager = new ProductsManager();
				
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
	}
}
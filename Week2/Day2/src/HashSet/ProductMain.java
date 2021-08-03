package HashSet;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productList = new HashSet<>();
		
		productList.add(new Product(2, "Milk", 19.99, 4.9, 5));
		productList.add(new Product(1, "Bread", 19.99, 4.5, 3));
		productList.add(new Product(4, "Chicken", 129.99, 4.4, 1));
		productList.add(new Product(2, "Milk", 19.99, 4.9, 5));
		productList.add(new Product(3, "Beer", 229.99, 4.6, 6));
		productList.add(new Product(4, "Chicken", 129.99, 4.4, 1));
		productList.add(new Product(5, "Nuts", 599.99, 3.9, 2));
		productList.add(new Product(1, "Bread", 19.99, 4.5, 3));
		productList.add(new Product(4, "Chicken", 129.99, 4.4, 1));
		
		
		ProductMain p = new ProductMain();
		System.out.println("Product List");
		p.printProduct(productList);
		
	}
	
	public void printProduct(Set<Product> productList) {
		for(Product p: productList) {
			System.out.println(p);
		}
	}

}

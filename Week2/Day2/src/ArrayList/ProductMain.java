package ArrayList;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Bread", 19.99, 4.5, 3));
		productList.add(new Product(2, "Milk", 19.99, 4.9, 5));
		productList.add(new Product(3, "Beer", 229.99, 4.6, 6));
		productList.add(new Product(4, "Chicken", 129.99, 4.4, 1));
		productList.add(new Product(5, "Nuts", 599.99, 3.9, 2));
		productList.add(new Product(6, "Tea", 399.99, 4.1, 9));
		productList.add(new Product(7, "Sweets", 239.99, 4.7, 1));
		productList.add(new Product(8, "Fish", 449.99, 4.5, 10));
		
		ProductMain p = new ProductMain();
		
		System.out.println("Product List");
		p.printProduct(productList);
		
		Collections.sort(productList, (Product p1, Product p2)-> {
			String s1 = p1.getName();
			String s2 = p2.getName();
			return s1.compareTo(s2);
		});
		System.out.println("\nSorting Product list by their name");
		p.printProduct(productList);
		
		
		Collections.sort(productList, (Product p1, Product p2)-> {
			Double c1 = p1.getCost();
			Double c2 = p2.getCost();
			int res = c1.compareTo(c2);
			if(res==0) {
				Double r1 = p1.getRating();
				Double r2 = p2.getRating();
				return r2.compareTo(r1);
			}
			return res;
		});
		System.out.println("\nSorting Product list by their cost");
		p.printProduct(productList);
	
		Collections.sort(productList,(Product p1, Product p2)-> {
			Double r1 = p1.getRating();
			Double r2 = p2.getRating();
			return r2.compareTo(r1);
		});
		System.out.println("\nSorting Product list by their Ratings");
		p.printProduct(productList);
		
		Collections.sort(productList, (Product p1, Product p2)-> {
			Integer q1= p1.getQuantity();
			Integer q2 = p2.getQuantity();
			return q2.compareTo(q1);
		});
		System.out.println("\nSorting Product list by their Quantity");
		p.printProduct(productList);
	}
	
	public void printProduct(List<Product> productList) {
		for(Product p: productList) {
			System.out.println(p);
		}
	}

}

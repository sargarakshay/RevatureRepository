package BillPrinting;
// Task 2 - Calculate total and print bill.
//          Item Name          Price    Qty.    Line Total
//          Line Total = Price * Qty.
//          Bill Total = Total of Line Total + 5% tax;
//          Items needs to be sorted based on Item Name.

import java.util.*;

public class ProductMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Bread", 19.99, 3));
        productList.add(new Product(2, "Milk", 19.99, 5));
        productList.add(new Product(3, "Beer", 229.99, 6));
        productList.add(new Product(4, "Chicken", 129.99, 1));
        productList.add(new Product(5, "Nuts", 599.99, 2));
        productList.add(new Product(6, "Tea", 399.99, 9));
        productList.add(new Product(7, "Sweets", 239.99, 1));
        productList.add(new Product(8, "Fish", 449.99, 10));

        productList.sort((Product p1, Product p2) -> {
            String s1 = p1.getName();
            String s2 = p2.getName();
            return s1.compareTo(s2);
        });

        ProductMain pm = new ProductMain();
        pm.printMainProducts(productList);
    }

    public void printMainProducts(List<Product> productList) {
        System.out.println("---------------------------------------");
        System.out.println("#  Name    Price   Qty.  Total");
        System.out.println("---------------------------------------");
        int  i = 1;
        for(Product p: productList) {
            Product.printProducts(i++, p);
        }
        System.out.println("---------------------------------------");
        Double totalBill = productList.stream().map(e -> e.getCost()*e.getQuantity()).reduce(0.0, (sum, bill) -> sum + bill);

        System.out.println("Total                    " + totalBill);
        System.out.println("5% GST                   " + totalBill*0.05);
        System.out.println("---------------------------------------");
        System.out.println("Final Bill               " + (totalBill*1.05));
        System.out.println("---------------------------------------");
    }
}

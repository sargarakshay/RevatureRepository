package StreamMinCost;
/*
 * 	// Task 1 - Find the minimum price in 'Xyz Travels'
	// Task 2 - Calculate total and print bill.
	//          Item Name          Price    Qty.    Line Total
	//          Line Total = Price * Qty.
	//          Bill Total = Total of Line Total + 5% tax;
	//          Items needs to be sorted based on Item Name.
	// Task 3 - allMatch(), anyMatch(), distinct()
	// Task 4 - Convert the Stream to Map.
 */


import java.util.*;
import java.util.stream.Collectors;

public class BusMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Bus> busList = new ArrayList<>();

        busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
        busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
        busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
        busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
        busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
        busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));

        double minPrice = busList.stream().filter(e -> e.getProviderName().equals("Xyz Travels")).map(e -> e.getCost()).reduce(Double.MAX_VALUE, (min, price) -> Math.min(min, price));
        double minPrice2 = busList.stream().filter(e -> e.getProviderName().equals("Xyz Travels")).map(e -> e.getCost()).min(Double::compare).get();



        System.out.println("Minimum price : " + minPrice);
        System.out.println("Minimum price : " + minPrice2);

    }


}

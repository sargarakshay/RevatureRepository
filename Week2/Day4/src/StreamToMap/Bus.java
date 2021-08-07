package StreamToMap;
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

public class Bus implements Comparable<Bus>{
    private int id;
    private String providerName;
    private double cost;
    private float rating;

    public Bus() {
        // TODO Auto-generated constructor stub
    }

    public Bus(int id, String providerName, double cost, float rating) {
        super();
        this.id = id;
        this.providerName = providerName;
        this.cost = cost;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Bus [id=" + id + ", providerName=" + providerName + ", cost=" + cost + ", rating=" + rating + "]";
    }

    @Override
    public int compareTo(Bus o) {
        Integer i1=this.id;
        Integer i2=o.id;
        return i1.compareTo(i2);
    }
}

package ArrayList;
/**
 * @author Akshay Vilas Sargar
 *
 */
public class Product {

	private int id;
	private String name;
	private double cost;
	private double rating;
	private int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double cost, double rating, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getRating() {
		return rating;
	}

	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [id = " + id + ", name = " + name + ", cost = " + cost + ", rating = " + rating + ", quantity = " +quantity + "]";
	}
	
}


public class Area {
	
	public double area(double side) {
		return side * side;
	}

	public double area(double height, double width) {
		return height * width;
	}
	
	public double area(double baseA, double baseB, double height) {
		return ((baseA + baseB) / 2) * height;
	}
}

class Shape extends Area {
	
	public static void main(String[] args) {
	
		Shape square = new Shape();
		Shape rectangle = new Shape();
		Shape trapazium = new Shape();
	
		System.out.println("Area of Square : " +square.area(10));
		System.out.println("Area of Rectangle : " +rectangle.area(10, 30));
		System.out.println("Area of Trapazium : " +trapazium.area(20, 30, 10));
}
}




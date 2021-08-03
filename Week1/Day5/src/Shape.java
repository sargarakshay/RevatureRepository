
public class Shape {
	double length = 10;
	double breath = 20;
	double heigth = 30;
}

class Square extends Shape {
	void area() {
		System.out.println("Area of Square : " +length*length);
	}
}

class Rectangle extends Shape {
	void area() {
		System.out.println("Area of rectangle : "+length*breath);
	}
}

class Trapazium extends Shape {
	void area() {
		System.out.println("Area of Trapazium : " + (length+breath)/2*heigth);
	}
}

class Inheritance {
	public static void main(String[] args) {
		Square sqr = new Square();
		Rectangle rec = new Rectangle();
		Trapazium trp = new Trapazium();
		sqr.area();
		rec.area();
		trp.area();
	}
}
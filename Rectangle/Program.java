
public class Program {

	public static void main(String[] args) {
		
		double width = 5;
		double length = 10;
		Rectangle rectangle = new Rectangle(length, width);
		rectangle.PrintArea();
		rectangle.PrintPerimeter();
		
		double side = 7;
		Square square = new Square(side);
		square.PrintArea();
		square.PrintPerimeter();

	}

}

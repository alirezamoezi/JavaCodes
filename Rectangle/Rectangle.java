
public class Rectangle {
	protected double Length;
	protected double Width;
	
	public Rectangle(double length, double width) {
		this.Length = length;
		this.Width = width;
	}
	public void PrintArea()
	{
		double area;
		area = Width * Length;
		System.out.println(area);
	}
	
	public void PrintPerimeter()
	{
		double perimeter;
		perimeter = (Length + Width) * 2;
		System.out.println(perimeter);
	}

}

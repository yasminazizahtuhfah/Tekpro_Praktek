package W8_Inheritance;

public class TestShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle (10, "Green");
		 System.out.println("Circle:"
				 + " color = " + c.getColor()
				 + " Radius = " + c.getRadius()
				 + " Instance = "+c.getArea()
		 		 + " Perimeter = "+ c.getPerimeter());
		 c.toString();
		 
		 Rectangle r = new Rectangle (12,3);
		 System.out.println("Rectangle:"
				 + " Width = " + r.getWidth()
				 + " Length = " + r.getLength()
				 + " Instance = "+r.getArea()
		 		 + " Perimeter = "+ r.getPerimeter());
		 r.toString();
		 
		 Square s = new Square(5);
		 System.out.println("Square:"
				 + " Side = " + s.getLength()
				 + " Instance = "+s.getArea()
		 		 + " Perimeter = "+ s.getPerimeter());
		 s.toString();
	}
}
package W8_Inheritance;

public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
	
	public double getArea() {
		return super.getLength() * super.getWidth();
	}

	public double getPerimeter() {
		return 2 * (super.getLength() + this.getWidth());
	}

	public void setLength(int side) {
		super.setLength(side);
	}

	public void setWidth(int side) {
		super.setWidth(side);
	}

	public String toString() {
		return "A Square with side="+this.getLength()+", which is a subclass of "+super.toString();
	}
}

package W8_Inheritance;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "A Shape with color of" + getColor() + "and filled = " + isFilled();
	}
}

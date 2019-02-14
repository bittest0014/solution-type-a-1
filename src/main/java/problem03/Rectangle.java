package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		System.out.println("");
	}

	@Override
	public void resize(double rate) {
		this.width = width * rate;
		this.height = height * rate;
	}

	@Override
	public double getArea() {
		double s = width * height;
		return s;
	}

	@Override
	public double getPerimeter() {
		double c = (width+height)*2;
		return c;
	}
}
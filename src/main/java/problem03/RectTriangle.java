package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double s = width * height / 2;
		return s;
	}

	@Override
	public double getPerimeter() {
		double c = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return c+width+height;
	}
}

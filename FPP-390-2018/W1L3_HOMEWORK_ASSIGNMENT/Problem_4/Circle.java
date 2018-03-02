package Problem_4;

public final class Circle {
	private final double radious;

	public Circle(double radious) {

		this.radious = radious;
	}

	public double getRadious() {
		return radious;
	}

	public double computeArea() {
		return (Math.PI * radious * radious);

	}
}

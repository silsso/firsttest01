package chapter02;

public class Cylinder extends Circle {
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double Volume() {
        return getArea() * height;
    }

	public static void main(String[] args) {
		double radius = 2.8;
		double height = 5.6;
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		System.out.println("원통의 부피 : " + cylinder.Volume());
		

	}

}
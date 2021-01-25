package Geometry;

public class Circle extends Shape {

    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    @Override
    public double getPerimeter() {
        return (2 * PI) * this.radius;
    }

    @Override
    public double getArea() {
        return this.PI * (Math.pow(this.radius, 2));
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double value) {
        this.radius = value;
    }

    public String display() {
        try {
            return "circle of radius " + this.radius + " at ("+ super.getShapeCenter().getXCoordinate() + " , " + super.getShapeCenter().getYCoordinate() + ")";
        } catch (NoCenterPointFound noCenterPointFound) {
            return "circle of radius " + this.radius;
        }
    }
}

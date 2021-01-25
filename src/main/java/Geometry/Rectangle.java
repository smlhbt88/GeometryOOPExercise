package Geometry;

public class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return  this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public void setLength(int value) {
        this.length = value;
    }

    public String display() {
        try {
                return this.length + " X " + this.width
                        + " rectangle at (" + super.getShapeCenter().getXCoordinate() + " , " + super.getShapeCenter().getYCoordinate() + ")";
        } catch (NoCenterPointFound noCenterPointFound) {
            return this.length + " X " + this.width
                    + " rectangle";
        }
    }

}

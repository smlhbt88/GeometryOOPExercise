package Geometry;

public class Rectangle extends Shape{

    private int length;
    private int width;

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

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return  this.width;
    }

    public int getLength() {
        return this.length;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public void setLength(int value) {
        this.length = value;
    }
}

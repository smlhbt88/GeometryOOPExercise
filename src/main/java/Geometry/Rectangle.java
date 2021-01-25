package Geometry;

public class Rectangle {

    private int length;
    private int width;

    Rectangle(){
        this.width = 1;
        this.length = 1;
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

package Geometry;

public class Point {

    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getXCoordinate() {
        return x;
    }

    public double getYCoordinate() {
        return y;
    }

    public void movePoint(double x, double y) {
        this.x+=x;
        this.y+=y;
    }
}

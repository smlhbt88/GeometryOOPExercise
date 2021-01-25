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

    public double calculateDistance(Point shapeCenter, Point shapeCenter1) {
        double x = Math.pow(shapeCenter1.getXCoordinate()-shapeCenter.getXCoordinate(),2);
        double y = Math.pow(shapeCenter1.getYCoordinate()-shapeCenter.getYCoordinate(),2);
        return Math.sqrt(x+y);
    }
}

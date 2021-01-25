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
        double x = Math.pow(Math.abs(shapeCenter1.getXCoordinate()-shapeCenter.getXCoordinate()),2);
        double y = Math.pow(Math.abs(shapeCenter1.getYCoordinate()-shapeCenter.getYCoordinate()),2);
        return Math.sqrt(x+y);
    }

    @Override
    public String toString() {
        return "("+this.getXCoordinate()+","+this.getYCoordinate()+")";
    }

    public String segmentDisplay(Point point1) {
        //[(x,y)--(x,y)]
        return "[("+this.getXCoordinate()+","+this.getYCoordinate()
                +"--("+point1.getXCoordinate()+","+point1.getYCoordinate()+")]";
    }
}

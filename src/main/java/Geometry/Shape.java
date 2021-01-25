package Geometry;

import java.awt.geom.NoninvertibleTransformException;

public abstract class Shape {

    private String color;
    private Point centerPoint;

    Shape() {
        this.color = "Burnt Umber";
    }

    void setColor(String value) {
        this.color = value;
    }

    String getColor() {
        return this.color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public void setShapeCenter(Point point) {
        this.centerPoint = point;
    }

    public Point getShapeCenter() throws NoCenterPointFound {
        if(centerPoint == null) {
            throw new NoCenterPointFound("No shape found");
        }
        return centerPoint;
    }
}

package Geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    private String color;
    private Point centerPoint;
    private List<Shape> shapes;

    Shape() {
        this.color = "Burnt Umber";
        shapes = new ArrayList<Shape>();
    }

    void setColor(String value) {
        this.color = value;
    }

    String getColor() {
        return this.color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String display();

    public void setShapeCenter(Point point) {
        this.centerPoint = point;
    }

    public Point getShapeCenter() throws NoCenterPointFound {
        if(centerPoint == null) {
            throw new NoCenterPointFound("No shape found");
        }
        return centerPoint;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public String allShapesDisplay() {
        StringBuilder result=new StringBuilder();
        for(int i=0; i<shapes.size();i++) {
            result.append(shapes.get(i).display());
            if(i!=shapes.size()-1){
                result.append("\n");
            }
        }
        return  result.toString();
    }
}

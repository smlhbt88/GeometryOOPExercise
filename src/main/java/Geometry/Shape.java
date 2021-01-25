package Geometry;

public abstract class Shape {

    private String color;

    Shape(){
        this.color = "Burnt Umber";
    }

     void setColor(String value){
        this.color = value;
     }

     String getColor(){
         return this.color;
     }

    public abstract double getPerimeter();

    public abstract double getArea();
}

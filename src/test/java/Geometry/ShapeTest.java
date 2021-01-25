package Geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    private Shape shape;

    @Test
    public void settingColorOfAShapeChangesTheColor(){
        shape = new Circle();
        shape.setColor("blue");

        assertEquals("blue", shape.getColor());
    }

    @Test
    public void shapeWithNoAssignedColorReturnsDefaultColor(){
        shape = new Rectangle();


        assertEquals("Burnt Umber", shape.getColor());
    }

    @Test
    public void calculateAPerimeterOfAShape(){
        shape = new Circle(5.00);

        assertEquals(31.4 , shape.getPerimeter(),0.1);

        shape = new Rectangle(4,6);

        assertEquals(20 , shape.getPerimeter(),0.1);

    }

    @Test
    public void calculateAnAreaofAShape(){
        shape = new Circle(5.00);

        assertEquals(78.5 , shape.getArea(),0.1);

        shape = new Rectangle(4,6);

        assertEquals(24 , shape.getArea(),0.1);

    }

    @Test
    public void displayAllShapes() {
        shape = new Circle(5.00);
        Shape shape1 = new Rectangle(4, 5);
        Shape shape2 = new Circle(9.0);
        Shape shape3 = new Rectangle(5.0,7.0);
        shape.addShape(shape);
        shape.addShape(shape1);
        shape.addShape(shape2);
        shape.addShape(shape3);
        String expectedResult = shape.display()+"\n"+shape1.display()+"\n"+shape2.display()+"\n"+shape3.display();
        assertEquals(expectedResult,shape.allShapesDisplay());
    }


}

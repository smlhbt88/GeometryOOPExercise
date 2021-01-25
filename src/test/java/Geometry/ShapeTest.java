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


}

package Geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void init(){
        this.rectangle = new Rectangle();
    }

    @Test
    public void testCreateRectangleAndCheckWidthAndLength(){
        rectangle = new Rectangle(2,3);
        assertEquals(2 , rectangle.getWidth(),0.1);
        assertEquals(3 , rectangle.getLength(),0.1);
    }

    @Test
    public void rectangleWithNoWidthAndLengthReturnsOne(){
        assertEquals(1 , rectangle.getWidth(),0.1);
        assertEquals(1 , rectangle.getLength(),0.1);
    }

    @Test
    public void modifyingWidthAndLengthOfTheRectangleChangesTheirValues(){
        rectangle = new Rectangle(3,5);
        rectangle.setWidth(8);
        rectangle.setLength(10);

        assertEquals(8 , rectangle.getWidth(),0.1);
        assertEquals(10 , rectangle.getLength(),0.1);
    }
}

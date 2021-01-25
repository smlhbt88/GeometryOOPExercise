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
        assertEquals(2 , rectangle.getWidth());
        assertEquals(3 , rectangle.getLength());
    }

    @Test
    public void rectangleWithNoWidthAndLengthReturnsOne(){
        assertEquals(1 , rectangle.getWidth());
        assertEquals(1 , rectangle.getLength());
    }

    @Test
    public void modifyingWidthAndLengthOfTheRectangleChangesTheirValues(){
        rectangle = new Rectangle(3,5);
        rectangle.setWidth(8);
        rectangle.setLength(10);

        assertEquals(8 , rectangle.getWidth());
        assertEquals(10 , rectangle.getLength());
    }
}

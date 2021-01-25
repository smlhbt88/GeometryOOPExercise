package com.geometry.Rectangle;

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

}

package Geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;

    @Before
    public void init(){
        circle  = new Circle();
    }

    @Test
    public void testCreateCircleAndRetrieveRadius(){
        circle = new Circle(2);

        assertEquals(2  , circle.getRadius(),0.00);
    }

    @Test
    public void circleWithNoRadiusReturnsOne(){
        assertEquals(1 , circle.getRadius(),0.01);
    }

    @Test
    public void modifyingRadiusOfTheCircleChangesItsValue(){
        circle = new Circle(5.00);

        circle.setRadius(8.00);

        assertEquals(8, circle.getRadius(),0.00);
    }


}

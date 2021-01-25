package Geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    private Point point;
    private Shape shape;

    @Before
    public void init() {
        point = new Point();
    }

    @Test
    public void createApointWithXandYCoordinates() {
        point = new Point(1, 2);

        assertEquals(1, point.getXCoordinate(), 0.1);
        assertEquals(2, point.getYCoordinate(), 0.1);
    }

    @Test
    public void setTheCenterOfAShape() {
        shape = new Circle();
        point = new Point(2, 3);

        shape.setShapeCenter(point);
        Point actualPoint = shape.getShapeCenter();

        assertEquals(2, actualPoint.getXCoordinate(), 0.1);
        assertEquals(3, actualPoint.getYCoordinate(), 0.1);
    }

    @Test
    public void retrieveShapePointCenter() {
        shape = new Circle();
        point = new Point(3,4);

        shape.setShapeCenter(point);
        Point actualPoint = shape.getShapeCenter();

        assertEquals(point, actualPoint);
    }
}

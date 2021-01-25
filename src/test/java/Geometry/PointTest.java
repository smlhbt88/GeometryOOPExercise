package Geometry;

import org.junit.Before;
import org.junit.Test;

import javax.swing.tree.ExpandVetoException;

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
    public void setTheCenterOfAShape() throws NoCenterPointFound {
        shape = new Circle();
        point = new Point(2, 3);

        shape.setShapeCenter(point);
        Point actualPoint = shape.getShapeCenter();

        assertEquals(2, actualPoint.getXCoordinate(), 0.1);
        assertEquals(3, actualPoint.getYCoordinate(), 0.1);
    }

    @Test
    public void retrieveShapePointCenter() throws NoCenterPointFound {
        shape = new Circle();
        point = new Point(3,4);

        shape.setShapeCenter(point);
        Point actualPoint = shape.getShapeCenter();

        assertEquals(point, actualPoint);
    }

    @Test(expected = NoCenterPointFound.class)
    public void testShapeThatCenterNotSet() throws NoCenterPointFound {

        shape = new Circle();
        shape.getShapeCenter();

    }

    @Test
    public void testMovePoint() {
        point = new Point(4,5);

        point.movePoint(3,3);

        assertEquals(7,point.getXCoordinate(),0.1);
        assertEquals(8, point.getYCoordinate(),0.1);
    }
}

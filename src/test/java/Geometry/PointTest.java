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


    @Test
    public void changeCenterPointForAShape() {
        shape = new Circle();
        point = new Point(3,4);

        shape.setShapeCenter(point);
        point.movePoint(9,1);
        shape.setShapeCenter(point);

        assertEquals(12,point.getXCoordinate(),0.1);
        assertEquals(5, point.getYCoordinate(),0.1);

    }

    @Test
    public void distanceBetweenTwoPointsOfAShapesCenter() throws NoCenterPointFound{
        shape = new Circle();
        point = new Point(3,4);
        shape.setShapeCenter(point);
        Shape shape1 = new Rectangle();
        Point point1 = new Point(5,8);
        shape1.setShapeCenter(point1);
        double actualDistance = point.calculateDistance(shape.getShapeCenter(),shape1.getShapeCenter());
        assertEquals(4.47,actualDistance,0.1);
    }

    @Test
    public void listResctangle() throws  NoCenterPointFound{
        Rectangle rectangle = new Rectangle(4,6);
        point = new Point(3,4);
        rectangle.setShapeCenter(point);
        String actualResult = rectangle.displayRectangle();
        assertEquals( rectangle.getLength()+" X "+ rectangle.getWidth()
                +" rectangle at (" +point.getXCoordinate()+" , "+point.getYCoordinate()+ ")",actualResult);

        Rectangle rectangle1 = new Rectangle(7,7);
        actualResult = rectangle1.displayRectangle();
        assertEquals( rectangle1.getLength()+" X "+ rectangle1.getWidth()
                +" rectangle",actualResult);
    }

    @Test
    public void displayCircle() {
        Circle circle = new Circle(4);
        point = new Point(3,4);
        circle.setShapeCenter(point);
        String actualResult = circle.displayCircle();
        assertEquals("circle of radius " + circle.getRadius() + " at ("+ point.getXCoordinate() + " , " + point.getYCoordinate() + ")",actualResult);

        Circle circle1 = new Circle(7);
        actualResult = circle1.displayCircle();
        assertEquals( "circle of radius " + circle1.getRadius(),actualResult);
    }


}

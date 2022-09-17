//This Program is prepared by 21CE118
//Part 3-Practical 1
/*Aim :: Create an abstract class GeometricObject as the superclass for Circle and
Rectangle. GeometricObject models common features of geometric objects. Both
Circle and Rectangle contain the getArea() and getPerimeter() methods for
computing the area and perimeter of a circle and a rectangle. Since you can
compute areas and perimeters for all geometric objects, so define the getArea() and
getPerimeter() methods in the GeometricObject class. Give implementation in the
specific type of geometric object. Create TestGeometricObject class to display area
and perimeter of Rectangle and Triangle, compare area of both and display results.
Design of all classes are given in the following UML diagram.
 */
package Practical1;
import java.util.Date;

abstract class GeometricObject//Abstract Class
{
    private String color;
    private boolean filled;
    private Date dateCreated;
    protected GeometricObject()//default constructor
    {
        dateCreated =new Date();
    }
    protected GeometricObject(String color, boolean filled)//parameterized constructor
    {
        dateCreated=new Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public String toString()
    {
        return "Created on :: "+dateCreated +"\n Color :: "+color+ "filled :: "+filled;
    }
    public abstract double getArea();//Abstract Method
    public abstract double getPerimeter();//Abstract Method
}
class Circle extends GeometricObject//Inherited subclass Circle
{
    private double radius;
    public Circle() { }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea() //method for get Area
    {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() //method for get  perimeter
    {
        return 2 * radius * Math.PI;
    }
    public double getDiameter() //for diameter
    {
        return 2 * radius;
    }
}
class Rectangle extends GeometricObject //inherited subclass Rectangle
{
    private double width;
    private double height;
    public Rectangle() {}
    public Rectangle(double width, double height)
    {
        this();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getArea() //for get Area
    {
        return width * height;
    }
    public double getPerimeter()//for get perimeter
    {
        return 2 * (width + height);
    }
}
public class TestGeometricObject
{
    public static void main(String[] args)
    {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(3, 7);
        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
    }
    public static void displayGeometricObject(GeometricObject object)
    {
        System.out.println(object);
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
    public static boolean equalArea(GeometricObject object1,GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

}
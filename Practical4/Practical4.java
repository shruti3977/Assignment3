//This Program is prepared by 21CE118 Shruti Sangani
//Part-3 Practical-4
//Aim ::  Develop a Program that illustrate method overriding concept.
package Practical4;
class Base//Super class
{
    void display()
    {
        System.out.println("Display Base class method");
    }
}
class Derived extends Base//Subclass
{
    void display()//method override
    {
        System.out.println("Display Derived class method");
    }
}
public class Practical4
{
    public static void main(String[] args)
    {
        Derived d=new Derived();
        d.display();//called derived class method
        Base d1= new Derived();
        d1.display();//called derived class method
        Base d2= new Base();
        d2.display();//called super class method
    }
}

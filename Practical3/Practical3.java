//This Program is prepared by 21CE118 Shruti Sangani
//Pert-3 Practical-3
/*Aim :: WAP that illustrate the interface inheritance. Interface P is extended by Practical5.P1 and P2 interfaces.
2 1,2 Interface P12 extends both Practical5.P1 and P2. Each interface declares one method and one constant.
Create one class that implements P12. By using the object of the class invokes each of its method
and displays constant.
 */
package Practical3;
interface P//interface
{
    int a=1;
    void displayP();
}
interface P1 extends P//interface
{
    int b=2;
    void displayP1();
}
interface P2 extends P//interface
{
    int c=4;
    void displayP2();
}
interface P12 extends P1,P2//interface
{
    int d=5;
    void displayP12();
}
class Printdata implements P12//implements interface
{
    @Override
    public void displayP()
    {
        System.out.println("Interface P displayP is :: "+a);
    }
    @Override
    public void displayP1()
    {
        System.out.println("Interface Practical5.P1 displayP1 is :: "+b);
    }
    @Override
    public void displayP2()
    {
        System.out.println("Interface P2 displayP2 is :: "+c);
    }
    @Override
    public void displayP12()
    {
        System.out.println("Interface P12 displayP12 is :: "+d);
    }
}
public class Practical3 {
    public static void main(String[] args)
    {
        Printdata p=new Printdata();
        p.displayP();
        p.displayP1();
        p.displayP2();
        p.displayP12();
    }
}
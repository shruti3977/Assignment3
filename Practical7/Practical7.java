//This Program is prepared by 21CE118 Shruti Sangani
//Part-3 Practical-7
//Aim :: Write a program that illustrates the significance of interface default method.
package Practical7;
interface B//interface
{
    default void method()
    {
        System.out.println("Default Method of interface B");
    }
}
interface C//interface
{
    default void method()
    {
        System.out.println("Default Method of interface C");
    }
}
public class Practical7 implements B,C
{
    public void method()
    {
        B.super.method();//called default method of interface B
        C.super.method();//called default method of interface C
    }
    public static void main(String[] args)
    {
        Practical7 g=new Practical7();
        g.method();//called public method
    }
}

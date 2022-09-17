//This Program is prepared by 21CE118 Shruti Sangani
//Part-3 Practical-5
//Aim :: Write a java program which shows importing of classes from other user define packages.
package Practical5;
import Practical5.P1.*;//import the class of different Package
public class Practical5
{
    public static void main(String[] args)
    {
        Sum s=new Sum();
        System.out.println("Sum of two Number is :: "+s.sum(3,7));
        Mul m=new Mul();
        System.out.println("Multiplication of two Number is :: "+m.mul(3,7));
    }
}

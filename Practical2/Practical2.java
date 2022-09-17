//This Program is prepared by 21CE118 Shruti Sangani
//Prat-3 Practical-2
/*Aim :: Write a program to create a default method in an interface IPrinter. Create an interface IPrinter
and IScanner. You can assume variables and methodsfor both interfaces. Create a concrete class to
implement both the interfaces. Create 5 objects of the class, store it in Vector and display the result
of the vector.
 */
package Practical2;
import java.util.Vector;//Vector Class
interface IPrinter//Interface
{
    String IP();
    default void show(){
        System.out.println("default IPrinter");
    }
}
interface IScanner//Interface
{
    String IS();
    default void show(){
        System.out.println("default Interface2");
    }
}

public class Practical2 implements IPrinter,IScanner//implements both the Interface
{
    @Override
    public String IP() {
        return "IPrinter";
    }

    @Override
    public void show() {
        IPrinter.super.show();
        IScanner.super.show();
    }

    @Override
    public String IS() {
        return "IScanner";
    }
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        Practical2 d = new Practical2();
        v.add(d.IP());
        v.add(d.IS());
        v.add(d.IP());
        v.add(d.IS());
        v.add(d.IP());
        d.show();
        int i;
        for(i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
    }
}

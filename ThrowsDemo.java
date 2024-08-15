/**
 * Throws keyword is used to define exceptions , that a method can throw in OOP.
 */
package exceptiondemo;

public class ThrowsDemo {

    void division(int a,int b)
    {
        int result= a/b;
        System.out.println("The division is :"+result);
    }

    public static void main(String[] args)
    {
        ThrowsDemo td1 = new ThrowsDemo();

        try{
            td1.division(10,0);
        }

        catch (ArithmeticException e){
            System.err.println(e);
        }

        try{
            td1.division(10,3);
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
    }
}

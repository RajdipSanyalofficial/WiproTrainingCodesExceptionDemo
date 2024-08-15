package exceptiondemo;

// Throw keyword is used to throw Exceptions explicitly/manually
public class ThrowDemo {

    public static void test(int a)
    {

        if(a==0)
            throw new ArithmeticException("Pass Non Zero Values : By Rajdip");

        else
            System.out.println("The value passed to method is :"+a);

    }

    public static void main(String[] args)
    {
        ThrowDemo.test(250);
        ThrowDemo.test(0);
    }
}

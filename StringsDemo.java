/**
 * Program to handle null pointer exception
 */


package exceptiondemo;

public class StringsDemo {

    public static void main(String[] args)
    {
        String s1="Hello World";
        String s2=null;
        // String s3="Java";

        try{
            System.out.println(s1.length());
            System.out.println(s2.length());
        }
        catch (Exception exception)
        {
            System.err.println("Exception occurred :"+exception);
        }
    }
}

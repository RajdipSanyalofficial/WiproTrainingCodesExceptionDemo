package exceptiondemo;

public class ArraysDemo {
    public static void main(String[] args) {

        String[] languages ={"C","C++","Java","Perl","Python","C#"};

        try {
            for (int i = 0; i <= languages.length; i++) {
                System.out.println(languages[i]);
            }
        }
        catch (Exception ex){
            System.err.println("Array error : "+ex.toString());
            System.err.println("Array error : "+ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally executes always");
        }

    }
}


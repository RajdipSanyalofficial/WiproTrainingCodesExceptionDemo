
package exceptiondemo;

public class ThrowsDemo2 {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop",50000);
        System.out.println("Product created : "+product1.getName()+" "+product1.getPrice());

        Product product2 = new Product("Laptop",50000);
        System.out.println("Product created : "+ product2.getName()+" "+ product2.getPrice());

        try{
            product1.applyDiscount(10);
            System.out.println("Product created : "+product1.getName()+" "+product1.getPrice());

            product2.applyDiscount(110);
            System.out.println("Product created : "+product2.getName()+" "+product2.getPrice());
        }
        catch (IllegalArgumentException e){
            System.err.println("Error : "+e.getMessage());
        }

    }
}




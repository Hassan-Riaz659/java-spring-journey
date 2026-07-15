package day3.challenge4;

/**
 * Demonstrates constructor overloading and independent method parameters
 * using the Product class.
 */

public class Master {
    public static void main(String[] args)
    {
        Product product = new Product("A case of exploding mangoes",50);
        product.applyDiscount(5);
        System.out.println(product);
    }

}

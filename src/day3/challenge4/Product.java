package day3.challenge4;
/**
 * Represents a product with a title and a price, demonstrating constructor
 * overloading (a default price when only a title is given) and a method
 * that takes its own parameters, independent of the constructor.
 */
public class Product {

    private String title;
    private int price;

    public Product(String title)
    {
        this.title = title;
        this.price = 0;
    }

    public Product(String title, int price)
    {
        this.title = title;
        this.price = price;
    }

    /**
     * Reduces the price by the given percentage and returns the new price.
     * Example: a 5% discount on a price of 50 reduces it by 2 (2.5 truncated
     * to an int), resulting in a new price of 48.
     */

    public int applyDiscount(double percentage){
        double discountAmount = this.price * percentage / 100.0;
        this.price = this.price - (int) discountAmount;
        return this.price;
    }

    @Override
    public String toString()
    {
        return "Name of the book is " + title + " and the price is " + this.price;
    }

}
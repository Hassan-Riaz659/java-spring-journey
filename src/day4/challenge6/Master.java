package day4.challenge6;

/**
 * Challenge 6 — Inheritance, method overriding, and super calls.
 *
 * Requirements:
 * - The parent class defines a constructor and at least one method.
 * - The child class extends the parent and calls the parent's constructor
 *   via super(...) from its own constructor.
 * - The child class overrides the parent's method, annotated with @Override.
 * - The overridden method calls the parent's original implementation via
 *   super.methodName() before adding its own additional behavior.
 * - A driver class creates an instance of the child class and calls the
 *   overridden method to observe the combined output.
 */

public class Master {

    public static void main(String[] args){
        Manager manager = new Manager("Hassan Riaz", 24);
        manager.printAddress();
    }

}

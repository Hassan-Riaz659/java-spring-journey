package day6.Challenge8.abstractVSInterface;

/**
 * Challenge 8 — Abstract Classes vs Interfaces.
 *
 * Requirements:
 * - An abstract class (Appliances) declares one abstract method
 *   (displaySpecs()) with no implementation, and one concrete method
 *   (printInfo()) that is fully implemented and shared by all subclasses,
 *   internally calling the abstract method to combine common logic with
 *   subclass-specific behavior.
 * - Multiple concrete classes (Desktop, Laptop, SmartPhone) extend the
 *   abstract class, each providing their own implementation of the
 *   abstract method.
 * - A separate interface (Chargeable) declares a method with no
 *   implementation, representing a capability unrelated to the class
 *   hierarchy above.
 * - One concrete class (Laptop) both extends the abstract class and
 *   implements the interface, demonstrating that a class can inherit
 *   from only one superclass but implement multiple interfaces.
 * - A driver class instantiates each concrete class, calls the shared
 *   method to observe each subclass's own behavior, and calls the
 *   interface method on the class that implements it.
 */

public class Master {

    public static void main(String[] args){

        Desktop d1 = new Desktop();
        Laptop l1 = new Laptop();
        SmartPhone m1 = new SmartPhone();

        d1.printInfo();
        l1.printInfo();
        m1.printInfo();
        System.out.println(l1.getChargeStatus());

    }
}

package day5.challenge7;

/**
 * Challenge 7 — Polymorphism.
 *
 * Requirements:
 * - A parent class (Vehicle) defines a method (move()) with a generic
 *   implementation.
 * - Two child classes (Car, Bike) extend the parent and each override
 *   move() with their own distinct behavior.
 * - A parent-type reference variable is assigned a child-type object
 *   (Vehicle v = new Car()), demonstrating that calling the overridden
 *   method invokes the child's implementation based on the object's
 *   actual runtime type, not the reference's declared type.
 * - An array of the parent type holds a mix of different child-type
 *   objects; iterating over it and calling the same method on each
 *   element automatically triggers each object's own correct behavior,
 *   with no type-checking required.
 */

public class Master {

    public static void main(String[] args){
        Vehicle a8 = new Car();
        a8.move();

        Vehicle[] vehicles = {new Car(), new Bike() };

        for(Vehicle vehicle : vehicles)
        {
            vehicle.move();
        }

    }
}

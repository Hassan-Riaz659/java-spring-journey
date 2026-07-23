package day6.Challenge8.abstractVSInterface;

abstract class Appliances {
    abstract String displaySpecs();

    void printInfo(){
        System.out.println("This device has: " + displaySpecs());
    }
}

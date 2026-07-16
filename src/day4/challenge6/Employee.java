package day4.challenge6;

public class Employee {

    protected String name;
    protected String address;

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Employee(String name){
        this.name = name;
        this.address = "not provided yet";
    }

    public void printAddress()
    {
        System.out.println("The address of " + name + " is " + address);
    }
}

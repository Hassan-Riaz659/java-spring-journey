package day4.challenge6;

public class Manager extends Employee{
    protected int teamSize;

    public Manager(String name, int teamSize){
        super(name);
        this.teamSize = teamSize;
    }
    @Override
    public void printAddress(){
        super.printAddress();
        System.out.println("Team size of the manager is : " +teamSize);

    }
}

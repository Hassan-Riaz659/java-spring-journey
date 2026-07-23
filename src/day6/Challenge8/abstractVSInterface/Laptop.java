package day6.Challenge8.abstractVSInterface;

public class Laptop  extends Appliances implements Chargeable {

    @Override
    String displaySpecs() {
        return "Screen size is 14.1 inches with 2 speakers";
    }

   public String getChargeStatus() {
        return "The laptop's Battery 100%";
    }

}

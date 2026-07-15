package day3.challenge5;

public class Car {
/*    Challenge 5 (Ch.5 gap — composition, dobara verify karna hai):
    Bina purane ClockHand code ko dekhe, khud se ek chhota composition example
    banao — jaise ek Car class jisme Engine naam ki ek dusri class ka object bataur field ho (has-a relationship),
    aur Car ka koi method andar se Engine ke method ko call kare. (Simple rakho — Engine mein bas ek start() method
    ho jo print kare "Engine started", aur Car ka start() method usay call kare.)*/
     private Engine engine;

     public Car(){
         this.engine = new Engine();
     }
     public void start(){
         this.engine.start();
     }
}

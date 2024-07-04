package weekonesequences.study;

abstract class Vehicle {

    Vehicle(){

    }
     protected abstract void run();

     protected void honk(){
         System.out.println("Vehicle Honk");
     }

}

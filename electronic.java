package  interfaces;



public class Electronic{

    boolean onOrOff = false;

    boolean on();

    boolean off();



    default void Electronic(){

        if (onOrOff){

            System.out.println("Default");

        }

    }

}

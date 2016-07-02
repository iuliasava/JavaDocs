package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 7/2/2016.
 */
public class Except extends Exception {

    public Except(){
        System.out.println("This is my Exception.");
    }

}

class ExtendExcept extends Except {

    public ExtendExcept(){
        System.out.println("This is my Extended Exception.");
    }

    //!!Am folosit exceptiile in clasa Circle.!!
}

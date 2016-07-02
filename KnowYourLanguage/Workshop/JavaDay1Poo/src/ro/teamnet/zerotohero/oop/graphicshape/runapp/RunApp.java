package ro.teamnet.zerotohero.oop.graphicshape.runapp;

import ro.teamnet.zerotohero.oop.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.*;

/**
 * Created by user on 7/1/2016.
 */
public class RunApp {

    public static void main(String[] args) {

        Circles circles = new Circles();
        Canvas canvas = new Canvas();
        Shape shape = new Circle(10);
        Shapebehaviour shapeb = new Square(10);

        System.out.println("The default circle area is " + circles.getAreaPub());
        circles.getAreaDef();

        System.out.println("The circle area is " + shape.area());
        System.out.println("The square area is " + shapeb.area());

        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));

        Imutable imute = new Imutable(1, 2);
    }
}

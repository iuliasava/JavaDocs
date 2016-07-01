package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 7/1/2016.
 */
public class Square extends Shape{

    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

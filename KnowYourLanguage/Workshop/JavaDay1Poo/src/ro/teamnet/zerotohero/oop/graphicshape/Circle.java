package ro.teamnet.zerotohero.oop.graphicshape;
import static java.lang.Math.PI;
/**
 * Created by user on 7/1/2016.
 */
public class Circle extends Shape {

    private int xPos;
    private int yPos;
    private int radius;

    public Circle(){
        xPos = 7;
        yPos = 3;
        radius = 3;
    }

    public Circle(int radius){
        this.radius =radius;
    }

    public Circle(int xPos,int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Circle(int xPos,int yPos, int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius =radius;
    }


    @Override
    public double area() {
        return 2 * PI * radius * radius;
    }

    public String toString(){
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public void fillColor(){
        System.out.println(super.color);
    }

    public void fillColor(int color){
        super.setColor(color);
        System.out.println("The circle color is now " + super.color);
    }

    public void fillColor(float saturation){
        super.setSaturation(saturation);
        System.out.println("The circle saturation is now " + super.saturation);
    }
}

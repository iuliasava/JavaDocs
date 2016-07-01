package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 7/1/2016.
 */

public class Shape extends AbstractShape implements Shapebehaviour {
    protected int color;
    protected float saturation;

    public double area(){
        double toReturn = 0;
        return toReturn;
    }

    public void setColor(int color){
        this.color = color;
    }

    public void setSaturation(float saturation){
        this.saturation = saturation;
    }

    public int getColor(){
        return color;
    }

    public float getSaturation(){
        return saturation;
    }
}





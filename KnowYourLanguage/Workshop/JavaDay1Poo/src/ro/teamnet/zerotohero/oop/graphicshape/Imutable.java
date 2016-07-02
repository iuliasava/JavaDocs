package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 7/1/2016.
 */
public class Imutable {

    private final int x;
    private final int y;

    public Imutable(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

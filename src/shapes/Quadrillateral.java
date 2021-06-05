package shapes;

public abstract class Quadrillateral extends Shape implements Measureable{

    protected double length;
    protected double width;

    public  Quadrillateral(double length, double width){
        this.length = length;
        this.width = width;
    }

}

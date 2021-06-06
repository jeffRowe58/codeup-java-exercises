package shapes;

public abstract class Quadrilateral extends Shape implements Measureable{

    protected double length;
    protected double width;

    public  Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

}

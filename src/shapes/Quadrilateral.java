package shapes;

public abstract class Quadrilateral extends Shape implements Measureable{

    protected double length;
    protected double width;
    protected double side;

    public  Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }


    public Quadrilateral(double side) {
        this.side = side;
    }

    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}

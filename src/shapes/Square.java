package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side,side);
    }

    public double getPerimeter(){
        return Math.pow(this.length, 2);
    }

    public double getArea(){
        return this.length * 4;
    }
}


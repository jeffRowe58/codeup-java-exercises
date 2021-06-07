package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {

        return Math.pow(side, 2);
    }
}


package shapes;

public class Square extends Quadrilateral{


    public Square(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return width * 4;
    }

    public double getArea() {

        return Math.pow(width, 2);
    }
}


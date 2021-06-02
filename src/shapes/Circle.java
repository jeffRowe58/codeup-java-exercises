package shapes;

public class Circle {
    public double area;
    public double cirumference;
    private double radius;
    private double PI = Math.PI;

    public Circle() {

    }


    public Circle(double radius) {

    }



    public void setRadius (double radius) {
            this.radius = radius;
        }
        public double getRadius () {
            return this.radius;
        }
        public double getArea () {
            return PI * radius * radius;
        }
        public double getCirumference () {
            return 2 * PI * radius;
        }


}

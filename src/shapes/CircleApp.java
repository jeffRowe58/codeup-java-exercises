package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input1 = new Input();
        Circle circle1 = new Circle();
        System.out.println("Please enter the radius of a circle.");
        double radi = input1.getDouble();
        circle1.setRadius(radi);
        System.out.println("Your area is: " + circle1.getArea());
        System.out.println("Your circumference is: " + circle1.getCirumference());


    }
}

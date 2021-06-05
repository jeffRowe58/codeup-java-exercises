package shapes;

public class ShapesTest {


    public static void main(String[] args) {
       Measureable myShape = new Rectangle(5, 10);
       Measureable myShape2 = new Square(10, 10);

        System.out.println(myShape.getArea());
        System.out.println(myShape2.getArea());
//        Rectangle box1 = new Rectangle(5,4);
//        Square box2 = new Square(5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}

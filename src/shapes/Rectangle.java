package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }


    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }

}

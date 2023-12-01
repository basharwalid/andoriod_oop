package Shape;

public class Rectangle extends Shape{

    public double length;
    public double width;
    Rectangle(){
        super();
        length = 0;
        width = 0;
    }

    Rectangle(String color , double length , double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
       return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle Color :"+color+" | Width : "+width+" | Length : "+length;
    }
}

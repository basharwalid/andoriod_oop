package Shape;

public class Triangle extends Shape{

    public int base;
    public int height;
    Triangle(){
        super();
        base = 0;
        height =0;
    }

    Triangle(String color , int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5*height*base;
    }

    @Override
    public String toString() {
        return "Triangle Color :"+color+" | Base : "+base+" | Height : "+height;
    }
}

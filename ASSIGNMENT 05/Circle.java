
public class Circle implements Shape {
    float rad;
    float circleArea;
    float circlePerimeter;

    public Circle(float rad) {
        this.rad = rad;
    }

    @Override
    public float calculateArea() {
        circleArea = (float) (pi*Math.pow(rad,2));
        return circleArea;
    }

    @Override
    public float calculatePerimeter() {
        circlePerimeter = (2*pi*rad);
        return circlePerimeter;
    }
    public String toString(){
        return "Area of circle "+circleArea+"\t"+"Perimeter of circle "+circlePerimeter;
    }
}
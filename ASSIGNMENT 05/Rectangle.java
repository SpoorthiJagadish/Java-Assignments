public class Rectangle implements Shape {
    float length;
    float breadth;
    float rectanglePerimeter;
    float rectangleArea;

    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float calculateArea(){
        rectangleArea = (length*breadth);
        return rectangleArea;
    }

    public float calculatePerimeter(){
        rectanglePerimeter = ((2*length) + (2*breadth));
        return rectanglePerimeter;
    }
    public String toString(){
        return "Area of rectangle "+rectangleArea+"\t"+"Perimeter of rectangle "+rectanglePerimeter;
    }
}
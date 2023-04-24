public class Triangle implements Shape {
    float side1;
    float side2;
    float side3;
    float trianglePerimeter;
    float triangleArea;

    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float calculateArea(){
        triangleArea = (float)(0.5*side1+side2);
        return triangleArea;
    }

    public float calculatePerimeter(){
        trianglePerimeter = ((side1) + (side2) + (side3));
        return trianglePerimeter;
    }
    public String toString(){
        return "Area of triangle "+triangleArea+"Perimeter of triangle "+trianglePerimeter;
    }
}
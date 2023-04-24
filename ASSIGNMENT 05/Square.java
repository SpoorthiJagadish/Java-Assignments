public class Square implements Shape {
    float side;
    float squareArea;
    float squarePerimeter;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        squareArea = (side*side);
        return squareArea;
    }

    @Override
    public float calculatePerimeter() {
        squarePerimeter = (side + side);
        return squarePerimeter;
    }
    public String toString(){
        return "Area of square "+squareArea +"Perimeter of square "+squarePerimeter;
    }
}
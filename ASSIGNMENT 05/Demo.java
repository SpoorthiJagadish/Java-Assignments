public class Demo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println(c);

        Rectangle r = new Rectangle(10,5);
        r.calculateArea();
        r.calculatePerimeter();
        System.out.println(r);

        Triangle t = new Triangle(5,6,7);
        t.calculateArea();
        t.calculatePerimeter();
        System.out.println(t);

        Square s = new Square(5);
        s.calculateArea();
        s.calculatePerimeter();
        System.out.println(s);
    }
}
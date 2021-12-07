public class Circle extends Shape{

    private final double PI = 3.14;


    public Circle(int r) {
        super(r);
    }

    @Override
    public double calculateArea() {
        return PI * a*a;
    }

    @Override
    public double perimeter() {
        return 2*PI*a;
    }
}

public class Rectangle extends Shape{


    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculateArea(){
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }
}

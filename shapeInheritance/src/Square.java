public class Square extends Shape{


    public Square(int a) {
        super(a);
    }

    @Override
    public double calculateArea(){
        return a*a;
    }

    @Override
    public double perimeter(){

        return 4*a;
    }

}

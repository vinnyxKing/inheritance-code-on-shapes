public class Shape {
    protected int a;
    protected int b;

    protected String name;
    private double calculateArea;
    private double perimeter;

    public Shape() {
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape(int a) {
        this.a = a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public double calculateArea(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }
}

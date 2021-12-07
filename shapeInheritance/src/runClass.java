import javax.swing.*;

public class runClass {

    public static void main(String[] args) {

        Square mySquar = new Square(5);
        Rectangle myRect = new Rectangle(2, 4);
        Circle mycircle = new Circle(5);

        mySquar.setName("Square");
        myRect.setName("Rectangle");
        mycircle.setName("Circle");

        //how to create array
        Shape[] shapesArray = {mySquar, mycircle, myRect};

        String  output = "";

        for(Shape eachshape : shapesArray){
            output += "Shape name: " + eachshape.getName() + "\n";
            output += " Shape Area: " + eachshape.calculateArea() + "\n";
            output += " Shape Perimeter: " + eachshape.perimeter() + "\n \n";

        }

        JOptionPane.showMessageDialog(null, output);

    }
}

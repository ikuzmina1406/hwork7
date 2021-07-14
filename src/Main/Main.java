package Main;

import ua.GoIT.modul7.*;

public class Main {

    public static void main(String[] args) {


        Shape circle=new Circle();

        circle.printName();

        Shape quad =new Quad ();

        quad.printName();

        Shape triangle=new Triangle();

        triangle.printName();

        Shape square=new Square();

        square.printName();

        Shape trapezoid=new Trapezoid();

        trapezoid.printName();


        circle.calcSquare();
    }
}

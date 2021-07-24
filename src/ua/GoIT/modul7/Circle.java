package ua.GoIT.modul7;

public class Circle extends Shape {

    @Override
    public void printName() {
        System.out.println("Круг");
    }
    @Override
    public String toString(){
        return  "Круг";
    }
    @Override
    public void calcSquare() {
        System.out.println("Площадь круга S равна : S = π * r2");
    }
}

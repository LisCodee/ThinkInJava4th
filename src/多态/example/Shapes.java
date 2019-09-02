package 多态.example;

import java.util.Random;

class Shape{
    public void print(){
        System.out.println("Shape.print()");
    }
    public void draw(){}
    public void erase(){}
}
class Circle extends Shape{
    @Override
    public void print() {
        System.out.println("Circle.print()");
        super.print();
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
class Square extends Shape{
    @Override
    public void print() {
        super.print();
    }

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void print() {
        super.print();
    }
}
class RandomShapeGenerator{
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(5)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 3: return new Triangle();
            case 4: return new Line();
        }
    }
}
class Line extends Shape{
    @Override
    public void print() {
        super.print();
    }

    @Override
    public void draw() {
        System.out.println("Line.draw()");
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }
}
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i< s.length;i++)
            s[i] = gen.next();
        for(Shape shape:s)
            shape.draw();
    }
}

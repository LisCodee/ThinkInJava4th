package 接口.practice;

import java.util.Random;

class Mouse implements Rodent {
    private int i = 0;
    Mouse(){
        System.out.println("Mouse()"+i);
    }

    public void eat() {
        System.out.println("Mouse.eat()");
    }
}
class Gerbil implements Rodent {
    private int i = 0;
    Gerbil(){
        System.out.println("Gerbil()" + i);
    }

    public void eat() {
        System.out.println("Gerbil.eat()");
    }
}
class Hamster implements Rodent {
    private int i= 0;
    Hamster(){
        System.out.println("Hamster()" + i);
    }

    public void eat() {
        System.out.println("Hamster.eat()");
    }
}
class RandomRodentGenerator{
    private Random rand = new Random();
    public Rodent next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
    }
}
public interface Rodent {
    int i = 0;
    abstract void eat();
    public static void main(String[] args) {
        Mouse m = new Mouse();
    }
}

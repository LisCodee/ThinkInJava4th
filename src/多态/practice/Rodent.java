package 多态.practice;

import java.util.Random;

class Mouse extends Rodent{
    private int i = 0;
    Mouse(){
        System.out.println("Mouse()"+i);
    }
    @Override
    void eat() {
        System.out.println("Mouse.eat()");
    }
}
class Gerbil extends Rodent{
    private int i = 0;
    Gerbil(){
        System.out.println("Gerbil()" + i);
    }
    @Override
    void eat() {
        System.out.println("Gerbil.eat()");
    }
}
class Hamster extends Rodent{
    private int i= 0;
    Hamster(){
        System.out.println("Hamster()" + i);
    }
    @Override
    void eat() {
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
public class Rodent {
    private int i = 0;
    Rodent(){
        System.out.println("Rodent()" + i);
    }
    void eat(){
        System.out.println("Rodent.eat()");
    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
//        Rodent[] rs = new Rodent[3];
//        for(int i = 0; i< rs.length;i++)
//            rs[i] = new RandomRodentGenerator().next();
//        for(Rodent r:rs)
//            r.eat();
//        Rodent r = new Rodent();
//        r.eat();
    }
}

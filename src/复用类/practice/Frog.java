package 复用类.practice;
class Amphibian{
    void climb(){
        System.out.println("I can climb");
    }
    void swim(){
        System.out.println("I can swim");
    }
}
public class Frog extends Amphibian{
    void climb(){
        System.out.println("I am frog");
//        super.climb();
    }
    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.climb();
        a.swim();
    }
}

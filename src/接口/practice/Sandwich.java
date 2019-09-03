package 接口.practice;
interface FastFood{
    void ready();
    void pack();
}
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Pickle{
    Pickle(){
        System.out.println("Pickle()");
    }
}
public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

    @Override
    public void ready() {
        System.out.println("Sandwich is ready");
    }

    @Override
    public void pack() {
        System.out.println("Sandwich is packed");
    }
}

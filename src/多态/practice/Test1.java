package 多态.practice;
class Cycle{
    public void ride(){
        System.out.println("Cycle.ride()");
    }
    public int wheels(){
        return 2;
    }
}
class Unicycle extends Cycle{
    public void ride(){
        System.out.println("Unicycle.ride()");
    }

    @Override
    public int wheels() {
        return 3;
    }
}
class Bicycle extends Cycle{
    public void ride(){
        System.out.println("Bicycle.ride()");
    }

    @Override
    public int wheels() {
        return 4;
    }
}
class Tricycle extends Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()");
    }

    @Override
    public int wheels() {
        return 5;
    }
}
public class Test1 {
    public static void ride(Cycle c){
        System.out.println(c.wheels());
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}

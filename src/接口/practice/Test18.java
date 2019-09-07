package 接口.practice;
interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()");
    }
}
class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()");
    }
}
class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()");
    }
}
class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
class TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
public class Test18 {
    public static void cycleConsumer(CycleFactory c){
        Cycle cycle = c.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new UnicycleFactory());
        cycleConsumer(new TricycleFactory());
    }
}

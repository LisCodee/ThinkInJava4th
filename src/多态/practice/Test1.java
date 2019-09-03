package 多态.practice;

import sun.reflect.generics.tree.Tree;

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
    public void balance(){
        System.out.println("Unicycle.balance()");
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
    public void balance(){
        System.out.println("Bicycle.balance()");
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
        Cycle c1 = new Unicycle();
        Cycle c2 = new Bicycle();
        Cycle c3 = new Tricycle();
//        c1.balance();         向上转型后无法访问扩展方法
        ((Unicycle) c1).balance();
        ((Bicycle) c2).balance();
//        ((Tricycle) c3).balance();    没有此扩展接口，无法访问
    }
}

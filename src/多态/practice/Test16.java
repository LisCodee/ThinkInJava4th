package 多态.practice;

import java.util.Random;

class AlertStatus{
    public void alert(){}
}
class Didi extends AlertStatus{
    public void alert(){
        System.out.println("Didi");
    }
}
class Bibi extends AlertStatus{
    @Override
    public void alert() {
        System.out.println("Bibi");
    }
}
class Dudu extends AlertStatus{
    @Override
    public void alert() {
        System.out.println("Dudu");
    }
}
class Starship{
    private AlertStatus a = new Didi();
    public void change(){
        Random r = new Random();
        switch (r.nextInt(2)){
            default:
            case 0: a = new Bibi();
            case 1: a = new Dudu();
        }
    }
    public void alert(){
        a.alert();
    }
}
public class Test16 {
    public static void main(String[] args) {
        Starship s = new Starship();
        s.alert();
        s.change();
        s.alert();
        s.change();
        s.alert();
        s.change();
    }
}

package 复用类.practice;
import 复用类.example.*;
class Other extends Auxiliary{
    void printf(){
        super.print();
    }
}
public class Test15 {
    public static void main(String[] args) {
        Auxiliary a = new Auxiliary();
//        a.print();        //不可访问
        Other o = new Other();
        o.printf();         //可以访问
    }
}

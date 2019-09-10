package 内部类.example;
class Outer{
    public class Inner{}
}
public class Test5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
    }
}

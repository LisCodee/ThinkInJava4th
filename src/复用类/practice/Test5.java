package 复用类.practice;
class A{
    A(int i){
        System.out.println("A constructor");
    }
}
class B{
    B(int i){
        System.out.println("B constructor");
    }
}
class C extends A{
    C(int i){
        super(i);
        System.out.println("C constructor");
    }
    B b = new B(11);
}
public class Test5 {
    public static void main(String[] args) {
        C c = new C(11);
    }
}
/**
 * output:
 * A constructor
 * B constructor
 */

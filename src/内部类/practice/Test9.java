package 内部类.practice;
interface A{
    void read();
}
public class Test9 {
    public static A getA(){
        class Inner implements A{
            @Override
            public void read() {
                System.out.println("Inner.read()");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        A a = getA();
        a.read();
    }
}

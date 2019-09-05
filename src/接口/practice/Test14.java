package 接口.practice;
interface I1{
    void m1();
    void m2();
}
interface I2{
    void m3();
    void m4();
}
interface I3{
    void m5();
    void m6();
}
interface I4 extends I1,I2,I3{
    void m7();
}
class C1{}
public class Test14 extends C1 implements I4{
    public static void method1(I1 i){
        i.m1();
    }
    public static void method2(I2 i){
        i.m3();
    }
    public static void method3(I3 i){
        i.m5();
    }
    public static void method4(I4 i){
        i.m7();
    }
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }

    @Override
    public void m5() {
        System.out.println("m5");
    }

    @Override
    public void m6() {
        System.out.println("m6");
    }

    @Override
    public void m7() {
        System.out.println("m7");
    }

    public static void main(String[] args) {
        Test14 t = new Test14();
        method1(t);
        method2(t);
        method3(t);
        method4(t);
    }
}

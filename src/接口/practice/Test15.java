package 接口.practice;

abstract class AbsClass extends C1{
    abstract void m8();
}
public class Test15 extends AbsClass implements I1,I2,I3{
    public static void method1(I1 i){
        i.m1();
    }
    public static void method2(I2 i){
        i.m3();
    }
    public static void method3(I3 i){
        i.m5();
    }
    public static void method8(AbsClass i){
        i.m8();
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
    void m8() {
        System.out.println("m8");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        method1(t);
        method2(t);
        method3(t);
        method8(t);
    }
}

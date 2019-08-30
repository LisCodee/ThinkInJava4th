package 初始化与清理.practice;

public class Test8 {
    void method1(){
        System.out.println("this is method1");
        method2();
        this.method2();
    }
    void method2(){
        System.out.println("this is method2");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        t.method1();
    }
}

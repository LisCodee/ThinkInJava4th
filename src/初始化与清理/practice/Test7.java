package 初始化与清理.practice;

public class Test7 {
    void doSomething(){
        System.out.println("我已经被实例化过了");
    }
    public static void main(String[] args) {
        Test7 t = new Test7();
        t.doSomething();
    }
}

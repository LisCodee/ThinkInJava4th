package 复用类.practice;

public class Test18 {
    static final int VAL = 10;
    final int val = 100;

    public static void main(String[] args) {
        Test18 t = new Test18();
        System.out.println(t.val);
        System.out.println(t.VAL);
        System.out.println(Test18.VAL);         //可以通过类访问，在内存堆中只分配一份存储空间，且在加载时更早
//        System.out.println(Test18.val);       //不可通过类访问
    }
}

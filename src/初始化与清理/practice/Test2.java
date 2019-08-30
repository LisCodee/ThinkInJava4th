package 初始化与清理.practice;

public class Test2 {
    String s = null;
    Test2(){
        System.out.println(s);
        s = "通过构造器初始化";
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
    }
}
/**
 output:
 null
 通过构造器初始化
 */
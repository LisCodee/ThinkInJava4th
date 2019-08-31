package 初始化与清理.practice;

public class Test15 {
    String s;
    {
        s = "实例初始化";
    }
    Test15(){
        System.out.println("构造器被调用");
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
    }
}

package 初始化与清理.practice;

public class Test14 {
    static String s1 = "我在定义处初始化";
    static String s2;
    static{
        s2 = "我在静态块中初始化";
    }
    Test14(){
        System.out.println(s1);
        System.out.println(s2);
        prints();
    }
    static void prints(){
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        new Test14();
    }
}

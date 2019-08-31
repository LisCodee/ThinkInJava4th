package 初始化与清理.practice;
class Other{
    public static void main(String... args) {
        for (String s: args)
            System.out.println(s);
    }
}

public class Test20 {
    public static void main(String[] args) {
        Other.main();
        Other.main("abc");
        Other.main("abc", "bcd");
    }
}

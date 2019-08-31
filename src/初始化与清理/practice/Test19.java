package 初始化与清理.practice;

public class Test19 {
    static void printS(String... strs){
        for (String s: strs)
            System.out.println(s);
    }

    public static void main(String[] args) {
        printS("abc", "bcd", "cde");
        printS(new String[]{"abc", "bcd", "cde"});
    }
}

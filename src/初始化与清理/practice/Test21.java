package 初始化与清理.practice;

public class Test21 {
    public static void main(String[] args) {
        for(Money m: Money.values())
            System.out.println(m + ":ordinal" + m.ordinal());
    }
}

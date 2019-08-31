package 初始化与清理.practice;

public class Test18 {
    Test18(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test18[] ts = new Test18[5];
        for(int i = 0; i < 5; i++)
            ts[i] = new Test18(Integer.toString(i));
    }
}

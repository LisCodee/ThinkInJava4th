package 初始化与清理.practice;

public class Test11 {
    protected void finalize(){
        System.out.println("该对象将被清理");
    }

    public static void main(String[] args) {
        new Test11();
        System.gc();
    }
}
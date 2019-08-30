package 初始化与清理.practice;

public class Test9 {
    int x;
    double y;
    Test9(int x){
        this.x = x;
    }
    Test9(int x, double y){
        this(x);
        this.y = y;
    }

    public static void main(String[] args) {
        Test9 t = new Test9(1,1.23);
        System.out.println(t.x);
        System.out.println(t.y);
    }

}

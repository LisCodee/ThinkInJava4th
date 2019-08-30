package 初始化与清理.practice;

public class Dog2 {
    void bark(int a, double b){
        System.out.println("barking");
    }
    void bark(double a, int b){
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.bark(1, 1.0);
        d.bark(1.2, 1);
    }
}

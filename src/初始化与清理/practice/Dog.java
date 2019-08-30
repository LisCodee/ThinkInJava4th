package 初始化与清理.practice;

public class Dog {
    void bark(int x){
        System.out.println("barking");
    }
    void bark(double x){
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark(0.1);
    }
}

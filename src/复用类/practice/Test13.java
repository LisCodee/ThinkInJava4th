package 复用类.practice;
class Assit{
    void print(int x){
        System.out.println(x);
    }
    void print(double x){
        System.out.println(x);
    }
    void print(char c){
        System.out.println(c);
    }
}
public class Test13 extends Assit{
    void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test13 t = new Test13();
        t.print(1);
        t.print(2.0);
        t.print('a');
        t.print("Hello");
    }
}

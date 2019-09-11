package 内部类.practice;
interface D{
    void read();
}
public class Test13 {
    public static D getD(){
        return new D(){
            public void read() {
                System.out.println("Inner.read()");
            }
        };
    }

    public static void main(String[] args) {
        D d = getD();
        d.read();
    }
}

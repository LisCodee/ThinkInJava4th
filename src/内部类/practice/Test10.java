package 内部类.practice;
interface B{
    void read();
}
public class Test10 {
    public static B getB(int x){
        if(x > 0){
            class Inner implements B{
                @Override
                public void read() {
                    System.out.println("Inner.read()");
                }
            }
            return new Inner();
        }
        else
            return null;
    }

    public static void main(String[] args) {
        B b = getB(20);
        b.read();
    }
}

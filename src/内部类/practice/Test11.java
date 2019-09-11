package 内部类.practice;

public class Test11 {
    private class Inner implements C{
        void read(){
            System.out.println("C.read()");
        }
    }
    public C getC(){
        return new Inner();
    }

}

package JVM;
import JVM.MyClass;

public class Test extends MyClass {
    private long l;
    private Integer i = 3;
    private long plong = 18L;
    public char c = 'B';
    public void add(int a, int b){
        Test test = this;
        int z = a+b;
        int x = 3;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.add(2,3);
        System.exit(0);
    }
}

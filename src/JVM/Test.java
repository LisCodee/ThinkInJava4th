package JVM;

public class Test {
    public int a = 3;
    static Integer si = 6;
    String s = "Hello world!";

    public static void main(String[] args) {
        Test test = new Test();
        test.a = 8;
        si = 9;
    }
    private void test(){
        this.a = a;
    }
}

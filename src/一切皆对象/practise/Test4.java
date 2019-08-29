package 一切皆对象.practise;
class DataOnly{
    int i;
    double d;
    boolean b;
}
public class Test4 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println("i:" + data.i + "\nd:" + data.d +"\nb:" + data.b);
    }
}

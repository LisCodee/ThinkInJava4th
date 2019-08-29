package 一切皆对象.practise;
class StaticTest{
    static int i = 47;
}
public class Incrementable {
    static void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

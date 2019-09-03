package 接口.practice;
abstract class Base{
    abstract void print();
    Base(){
        print();
    }
}
class Sub extends Base{
    private int i = 5;
    @Override
    void print() {
        System.out.println(i);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}

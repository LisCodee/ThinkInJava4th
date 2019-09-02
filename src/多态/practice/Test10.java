package 多态.practice;
class Base{
    void first(){
        this.second();
        System.out.println("Base.first()");
    }
    void second(){
        System.out.println("Base.second()");
    }
}
class Sub extends Base{
    @Override
    void second() {
        System.out.println("Sub.second()");
    }
}
public class Test10 {

    public static void main(String[] args) {
        Base sub = new Sub();
        sub.first();
    }
}

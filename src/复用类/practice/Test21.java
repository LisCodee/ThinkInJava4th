package 复用类.practice;
class FinalTest{
    final void print(){
        System.out.println("我是基类的final方法");
    }
}
public class Test21 extends FinalTest{
    //无法覆盖
//    @Override
//    void print(){
//        System.out.println("我想覆盖基类的final方法");
//    }
}

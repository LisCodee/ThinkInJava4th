package 接口.practice;
abstract class Abstract{
    abstract void print();
}
class A extends Abstract{
    public void print(){
        System.out.println("A.print()");
    }

}
public class Test4 {
    public static A caseType(Abstract a){
        return (A)a;
    }

    public static void main(String[] args) {
        Abstract a = new A();
//        a.print();        无法调用
        caseType(a).print();    //可以调用
        a.print();              //在基类中加了抽象方法print后可以直接调用
    }
}

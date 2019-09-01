package 复用类.example;
class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //你可以向上转型
        OverridingPrivate op = op2;
//        op.f();   //但是不能访问方法
//        op.g();
        WithFinals wf = op2;
//        wf.f();   //同上
//        wf.g();
    }
}

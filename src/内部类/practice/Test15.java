package 内部类.practice;
class Out{
    int x;
    public Out(int x){
        this.x = x;
    }
    public void f(){
        System.out.println("Out.f()");
    }
}
public class Test15 {
    public Out getOut(int x){
        return new Out(x){
            public void f(){
                System.out.println("Inner.f()");
            }
        };
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        Out o = t.getOut(10);
        o.f();
    }

}

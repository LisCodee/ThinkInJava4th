package 复用类.practice;
class Assist{

}
public class Test1 {
    Assist a;
    public void printAssist(){
        if(a == null)
            a = new Assist();
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.printAssist();
    }
}

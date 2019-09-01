package 复用类.practice;
class Father{
    Father(int a){
        System.out.println("Father constructor" + a);
    }
}
public class Test8 extends Father{
    Test8(){
        super(0);
        System.out.println("默认构造器");
    }
    Test8(int a){
        super(a);
        System.out.println("Test8.constructor" + a);
    }

    public static void main(String[] args) {
        Test8 t = new Test8(1);
    }
}

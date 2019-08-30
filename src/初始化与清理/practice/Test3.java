package 初始化与清理.practice;

public class Test3 {
    Test3(){
        System.out.println("无参构造器被调用");
    }
    Test3(String s){
        System.out.println("重载构造器被调用：" + s);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        Test3 t1 = new Test3("t1");
    }
}

package 初始化与清理.practice;

public class Test10 {
    protected void finalize(){
        System.out.println("该对象将被清理");
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
    }
}
//程序无输出，可能因为JVM内存没有面临耗尽情况，垃圾回收机制没有被调用

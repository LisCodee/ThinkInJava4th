package 内部类.practice;

public class Test8 {
    class Inner{
        private String s = "Inner String";
    }
    void print(){
//        System.out.println(s);        //不能访问
    }
}

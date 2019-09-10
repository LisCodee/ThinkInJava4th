package 内部类.practice;

public class Outer {
    private String s = "我是private String";
    class Inner{
        public String toString(){
            return s;
        }
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.getInner();
        System.out.println(i.toString());
    }
}

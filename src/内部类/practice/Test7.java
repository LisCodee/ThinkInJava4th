package 内部类.practice;

public class Test7 {
    private String s = "private s";
    private void print(){
        System.out.println(s);
    }
    class Inner{
        void modify(){
            s = "Inner private s";
        }
        void say(){
            print();
        }
    }
    void getInner(){
       Test7.Inner ti = this.new Inner();
       ti.say();
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.getInner();
    }
}

package 复用类.practice;
class Value{
    private int i = 0;
    Value(){}
    Value(int i){
        this.i = i;
    }
}
public class Test19 {
    private final Value value;
    Test19(){
        value = new Value();
    }
    Test19(int x){
        value = new Value(x);
    }

    public static void main(String[] args) {
        Test19 t = new Test19();
        Test19 t2 = new Test19(12);
    }
}

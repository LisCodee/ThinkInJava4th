package 一切皆对象.practise;
class Test8Sub{
    Test8Sub(){
        i++;
    }
    static int i = 0;
}
public class Test8 {
    public static void main(String[] args) {
        Test8Sub a = new Test8Sub();
        System.out.println(a.i);
        Test8Sub b = new Test8Sub();
        System.out.println(b.i);
    }
}

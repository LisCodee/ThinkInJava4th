package 复用类.practice;
class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 init");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
class Bug extends Beeetle{
    private int l = printInit("Bug.l init");
    public Bug(){
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static Beetle.x3 init");
}
public class Beeetle extends Insect{
    private int k = printInit("Beetle.k init");
    public Beeetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 init");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beeetle b = new Beeetle();
    }
}

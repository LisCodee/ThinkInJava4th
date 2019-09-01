package 复用类.practice;
class Component1{
    Component1(){
        System.out.println("Component1 constructor");
    }
    void dispose(){
        System.out.println("Component1 disposed");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2 constructor");
    }
    void dispose(){
        System.out.println("Component2 disposed");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3 constructor");
    }
    void dispose(){
        System.out.println("Component3 disposed");
    }
}
class Root{
    Root(){
        System.out.println("Root constructor");
    }
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    void dispose(){
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Root disposed");
    }
}
public class Stem extends Root{
    Stem(){
        System.out.println("Stem constructor");
    }

    @Override
    void dispose() {
        System.out.println("Stem disposed");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem();
        System.out.println(s.c1);
        System.out.println(s.c2);
        System.out.println(s.c3);
    }
}

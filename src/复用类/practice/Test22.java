package 复用类.practice;
final class FinalClass{
    void print(){
        System.out.println("Finalclass");
    }
}
public class Test22 /* extends FinalClass 无法继承final类*/{
}

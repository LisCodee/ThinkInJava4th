package 控制执行流程.practice;

public class Test9 {
    static void Fib(int n){
        int front = 1, below = 1;
        System.out.println(front);
        if(n > 1)
            System.out.println(below);
        for(int i = 1;i < n;i++){
            int temp = below;
            below += front;
            front = temp;
            System.out.println(below);
        }
    }

    public static void main(String[] args) {
        Fib(5);
    }
}

package 接口.practice;

import 接口.example.InterfaceTest;

public class Test5 implements InterfaceTest {
    @Override
    public void print1(String s) {
        System.out.println(s);
    }

    @Override
    public void print2(int i) {
        System.out.println(i);
    }

    @Override
    public void print3(double d) {
        System.out.println(d);
    }
}

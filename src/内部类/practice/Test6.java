package 内部类.practice;

import 内部类.example.Test6Ass;
import 内部类.test.Imp;

public class Test6 extends Test6Ass {
    public Imp getSuper(){
        return super.getInner();
    }
}

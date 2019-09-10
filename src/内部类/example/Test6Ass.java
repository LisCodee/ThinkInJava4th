package 内部类.example;

import 内部类.test.Imp;

public class Test6Ass {
    public Imp getInner(){return new Inner();}
    protected class Inner implements Imp{
        @Override
        public void say() {
            System.out.println("Test6Ass.Inner.say()");
        }
    }
}

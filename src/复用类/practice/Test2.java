package 复用类.practice;

import 复用类.example.Detergent;

public class Test2 extends Detergent {
    public void scrub(){
        append("Test2.scrub()");
    }
    public void sterilize(){
        append("sterilize()");
    }
}

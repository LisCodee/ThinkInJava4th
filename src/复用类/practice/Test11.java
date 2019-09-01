package 复用类.practice;

import static net.mindview.util.Print.print;

class Cleanser{
    private String s = "Cleaanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append("diute()");
    }
    public void apply(){
        append("apply()");
    }
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}

public class Test11 {
    private Cleanser control = new Cleanser();

    public void append(String a) {
        control.append(a);
    }

    public void dilute() {
        control.dilute();
    }

    public void apply() {
        control.apply();
    }

    public void scrub() {
        control.scrub();
    }
}

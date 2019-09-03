package 接口.example;

import java.lang.reflect.Array;
import java.util.Arrays;

interface Processor{
    String name();
    Object process(Object input);
}
abstract class Test11 implements Processor{
    public String name() {
        return getClass().getName();
    }
    public abstract String process(Object input);
}
class StringAdd extends Test11{
    @Override
    public String process(Object input) {
        char[] s = ((String)input).toCharArray();
        for(int i = 0; i < s.length;i++)
            s[i] += 1;
        return Arrays.toString(s);
    }
}
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process((s)));
    }

    public static void main(String[] args) {
        process(new StringAdd(), "I love you");
    }
}

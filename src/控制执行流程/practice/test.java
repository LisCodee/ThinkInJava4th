package 控制执行流程.practice;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map a = new HashMap<Character, Integer>();
        a.put('a',1);
        Map b = new HashMap<Character, Integer>();
        b.put('a',1);
        System.out.println(a.equals(b));
    }


}

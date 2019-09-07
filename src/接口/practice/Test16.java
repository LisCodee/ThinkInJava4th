package 接口.practice;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Test16 implements Readable{
    private Random r = new Random();
    private int count;
    private char[] cs;
    public Test16(int count){
        this.count = count;
        cs = new char[count];
        for(int i = 0; i < count;i++)
            cs[i] = (char) (r.nextInt(96));
    }

    public char next(){
        return cs[count];
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(--count < 0)
            return -1;
        cb.append(next());
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new Test16(100));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }
}

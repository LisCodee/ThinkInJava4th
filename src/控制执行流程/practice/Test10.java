package 控制执行流程.practice;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        for(int i = 10;i <= 100;i++){
            for(int j = 10;j <= 100;j++){
                if(i * j < 10000 && i * j > 1000){
                    int res = i * j;
                    char[] begin = (Integer.toString(i) + Integer.toString(j)).toCharArray();
                    char[] end = Integer.toString(i * j).toCharArray();
                    Map<Character,Integer> b = new HashMap<>();
                    for(int k = 0;k<begin.length;k++){
                        if(b.get(begin[k])!=null){
                            b.put(begin[k],b.get(begin[k])+1);
                        }else{
                            b.put(begin[k], 1);
                        }
                    }
                    Map<Character,Integer> e = new HashMap<>();
                    for(int k = 0;k<begin.length;k++){
                        if(e.get(begin[k])!=null){
                            e.put(begin[k],b.get(begin[k])+1);
                        }else{
                            e.put(begin[k], 1);
                        }
                    }
                    if(b.equals(e))
                        System.out.println(res);
                }
            }
        }
    }
}

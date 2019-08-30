package 初始化与清理.practice;

class Tank{
    boolean isEmpty = true;
    Tank(boolean isEmpty){
        this.isEmpty = isEmpty;
    }
    void setFull(){
        isEmpty = false;
    }
    protected void finalize(){
        if(!isEmpty){
            System.out.println("垃圾回收机制执行");
        }else{
            System.out.println("有空箱子，出现错误");
        }
    }
}
public class Test12 {
    public static void main(String[] args) {
        new Tank(false);
        new Tank(true);
        System.gc();
    }
}

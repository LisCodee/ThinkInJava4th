package 初始化与清理.practice;
class Book{
    boolean checkedOut = false;
    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error:checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //正确清理
        novel.checkIn();
        //删除引用，忘记清理
        new Book(true);
        //强制调用垃圾回收
        System.gc();
    }
}

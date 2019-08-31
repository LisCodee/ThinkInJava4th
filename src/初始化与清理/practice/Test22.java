package 初始化与清理.practice;

public class Test22 {
    static void description (Money m){
        switch (m){
            case ONE:
                System.out.println("ONE");
                break;
            case FIVE:
                System.out.println("FIVE");
                break;
            case TEN:
                System.out.println("TEN");
                break;
            case TWENTY:
                System.out.println("TWENTY");
                break;
            case FIFTY:
                System.out.println("FIFTY");
                break;
        }
    }
    public static void main(String[] args) {
        for (Money m:Money.values())
            description(m);
    }
}

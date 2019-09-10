package 内部类.example;

public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dti = dn.new Inner();
    }
}

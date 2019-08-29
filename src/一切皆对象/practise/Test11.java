package 一切皆对象.practise;
class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
}
public class Test11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
        a.changeTheHueOfTheColor(3);
        System.out.println(a.anIntegerRepresentingColors);
    }
}

package 多态.example;
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int i){
        this.radius = i;
        System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(),radius = " + radius);
    }
}
class RectangularGlyph extends Glyph{
    private int radius = 1;
    RectangularGlyph(int i){
        this.radius = i;
        System.out.println("RectangularGlyph.RectangularGlyph(),radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(),radius = " + radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2);
    }
}

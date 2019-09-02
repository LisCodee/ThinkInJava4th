package 多态.example;

import java.util.Random;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
    void play(Note n){
        System.out.println("Instrument.play" + n);
    }
    @Override
    public String toString(){       //为了方便，不将what改为toString而是重新写了一个
        return "Instrument";
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Wind.play()");
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()");
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Stringed.play()");
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
class Brass extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Brass.play()");
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
class Woodwind extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play()");
    }

    @Override
    String what() {
        return "Woodwind";
    }
}
class Piano extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Piano.play()");
    }

    @Override
    public String toString() {
        return "Piano";
    }

    @Override
    String what() {
        return "Piano";
    }

    @Override
    void adjust() {
        super.adjust();
    }
}
class RadomInstrumentGenerator{
    private Random gen = new Random(100);
    public Instrument next(){
        switch (gen.nextInt(7)){
            default:
            case 0: return new Instrument();
            case 1: return new Wind();
            case 2:return new Percussion();
            case 3:return new Stringed();
            case 4: return new Brass();
            case 5: return new Woodwind();
            case 6: return new Piano();
        }
    }
}
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i:e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
        System.out.println(new Instrument());
    }
}

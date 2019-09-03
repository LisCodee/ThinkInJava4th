package 接口.practice;

import java.util.Random;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
abstract class Instrument{
    abstract void play(Note n);
    abstract void adjust();
}
class Wind extends Instrument{
    public void play(Note n) {
        System.out.println("Wind.play()");
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()");
    }

    @Override
    public String toString() {
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
    public String toString() {
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
class RadomInstrumentGenerator{
    private Random gen = new Random(100);
    public Instrument next(){
        switch (gen.nextInt(5)){
            default:
            case 1: return new Wind();
            case 2:return new Percussion();
            case 3:return new Stringed();
            case 4: return new Brass();
        }
    }
}
public class Music5 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i:e)
            tune(i);
    }

    public static void main(String[] args) {

    }
}


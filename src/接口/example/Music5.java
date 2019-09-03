package 接口.example;

import java.util.Random;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
interface Playable{
    abstract void play(Note n);
}
interface Instrument{
    abstract void adjust();
}
class Wind implements Instrument, Playable{
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
class Percussion implements Instrument, Playable{
    public void play(Note n) {
        System.out.println("Percussion.play()");
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
class Stringed implements Instrument, Playable{
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
class Brass implements Instrument, Playable{
    public void play(Note n) {
        System.out.println("Brass.play()");
    }
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}
class RadomInstrumentGenerator{
    private Random gen = new Random(100);
    public Playable next(){
        switch (gen.nextInt(4)){
            default:
            case 1: return new Wind();
            case 2:return new Percussion();
            case 3:return new Stringed();
            case 0: return new Brass();
        }
    }
}
public class Music5 {
    public static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] e){
        for(Playable i:e)
            tune(i);
    }

    public static void main(String[] args) {

    }
}



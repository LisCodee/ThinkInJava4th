package 接口.example;
interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}
class ActionCharacter{
    public void fight(){

    }
}
interface CanClimb{
    void Climb();
}
class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim,CanClimb{
    @Override
    public void swim() {

    }

    @Override
    public void Climb() {

    }

    @Override
    public void fly() {

    }
}
public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void x(CanClimb x){
        x.Climb();
    }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        x(h);
    }
}

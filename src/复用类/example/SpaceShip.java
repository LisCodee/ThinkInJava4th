package 复用类.example;

class SpaceShipControls{
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forward(int velocity){}
    void back(int velocity){}
    void turboBoost(){}
}
public class SpaceShip {
    private String name;
    SpaceShip(String name){
        this.name = name;
    }
    private SpaceShipControls controls = new SpaceShipControls();

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }
}

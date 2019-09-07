package 接口.practice;

import java.util.Random;

interface Game{
    void start();
}
interface GameFactory{
    Game getGame();
}
class CoinGame implements Game{
    @Override
    public void start() {
        Random r = new Random();
        System.out.println(r.nextInt(2)==0?"正面":"反面");
    }
}
class DiceGame implements Game{
    @Override
    public void start() {
        Random r = new Random();
        System.out.println("骰子点数是："+r.nextInt(6));
    }
}
class CoinGameFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new CoinGame();
    }
}
class DiceGameFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new DiceGame();
    }
}
public class Test19 {
    public static void gameConsumer(GameFactory g){
        Game game = g.getGame();
        game.start();
    }

    public static void main(String[] args) {
        gameConsumer(new CoinGameFactory());
        gameConsumer(new DiceGameFactory());
    }
}

public class BasketballPlayer extends Player implements Athlete{

    public BasketballPlayer(String name, String team, int age, String height) {
        super(name, team, age, height);
    }

    public BasketballPlayer() {
    }

    @Override
    public void jump() {
        System.out.println("I can jump so high, I dunked on the whole team!");
    }

    @Override
    public void run() {
        System.out.println("I am fast like Russell Westbrook");

    }

    @Override
    public void tired() {
        System.out.println("I got tired once 2nd quarter hit!");
    }




}

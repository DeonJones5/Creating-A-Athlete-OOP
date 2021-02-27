public class BaseballPlayer extends Player implements Athlete{

    public BaseballPlayer(String name, String team, int age, String height) {
        super(name, team, age, height);
    }

    public BaseballPlayer() {
    }

    @Override
    public void jump() {
        System.out.println("I am not the best jumper, but I once jumped over someone to get to first base!");
    }

    @Override
    public void run() {
        System.out.println("I have to be fast, I got to third base before they could through the ball back!");

    }

    @Override
    public void tired() {
        System.out.println("I got tired by the 6th inning!");

    }
}

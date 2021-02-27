public class SoccerPlayer extends Player implements Athlete{

    public SoccerPlayer(String name, String team, int age, String height) {
        super(name, team, age, height);
    }

    public SoccerPlayer() {
    }

    @Override
    public void jump() {
        System.out.println("I can just because of all the running around I do on the soccer field!");
    }

    @Override
    public void run() {
        System.out.println("I am very fast, even with a soccer ball at my feet!");

    }

    @Override
    public void tired() {
        System.out.println("I don't really get tired, only a little because soccer games are 90 mins!");

    }
}

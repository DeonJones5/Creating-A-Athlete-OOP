public class TrackStar extends Player implements Athlete{

    public TrackStar(String name, String team, int age, String height) {
        super(name, team, age, height);
    }

    public TrackStar() {
    }

    @Override
    public void jump() {
        System.out.println("I do the long jump so I can jump far and high!");
    }

    @Override
    public void run() {
        System.out.println("Running is what I do! I can run a 4 min mile!");

    }

    @Override
    public void tired() {
        System.out.println("Kevin Gates said it best 'I dont get tired!'");

    }
}

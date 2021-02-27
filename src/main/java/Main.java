public class Main {
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer("Lebron James", "Lakers", 35, "6'8");
        BaseballPlayer player2 = new BaseballPlayer("A Rod", "Yankees", 45, "6'3");
        SoccerPlayer player3 = new SoccerPlayer("Lionel Messi", "Barcelona", 33, "5'7");
        TrackStar player4 = new TrackStar("Usain Bolt", "Jamicia", 34, "6'5");

        player1.jump();
        System.out.println(player1);
        System.out.println();
        player2.jump();
        System.out.println(player2);
        System.out.println();
        player3.jump();
        System.out.println(player3);
        System.out.println();
        player4.jump();
        System.out.println(player4);

        System.out.println();

        System.out.println(player1.getName() + ", how good are you at running?!");
        player1.run();

        System.out.println();

        System.out.println(player2.getName() + ", how good are you at running?!");
        player2.run();

        System.out.println();

        System.out.println(player3.getName() + ", how good are you at running?!");
        player3.run();

        System.out.println();

        System.out.println(player4.getName() + ", how good are you at running?!");
        player4.run();


    }
}

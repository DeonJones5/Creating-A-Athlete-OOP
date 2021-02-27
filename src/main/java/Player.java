public class Player {
    private String name;
    private String team;
    private int age;
    private String height;

    public Player(String name, String team, int age, String height) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.height = height;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "This player is: " + name +
                "\nHis team is: " + team +
                "\nHis age is: " + age +
                "\nHis height is: '" + height;
    }
}

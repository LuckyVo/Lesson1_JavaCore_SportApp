package geekbrains.Lesson1_JavaCore_GB;

public class Team {
    private String teamNickName;
    private String playerName;
    private int age, weight, height;

    public Team (String teamNickName) {
        this.teamNickName = teamNickName;
    }

    public Team (String playerName, int age, int weight, int height){
        this.playerName = playerName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int doCourse(Course course){
        return (course.doCourseSwimLength(age, weight, height) + course.doCourseRunLength(age, weight, height) +
                course.doCourseBicycleRace(age, weight, height));
    }

    public String infoTeam() {
        return "Выступает команда: " + teamNickName;
    }

    public String getPlayerName() { return playerName; }
    public String getTeamNickName() { return teamNickName; }

    @Override
    public String toString() {
       return "В её составе принимает участие игрок: " + playerName;
    }

}


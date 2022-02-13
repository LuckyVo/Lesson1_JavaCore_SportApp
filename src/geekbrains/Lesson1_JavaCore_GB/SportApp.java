package geekbrains.Lesson1_JavaCore_GB;

public class SportApp {

    public static void main(String[] args) {

        int countPlayers = 1;
        int teamTime = 0;
        int playerTime = 0;

        Team team = new Team("Спартак");
        System.out.println(team.infoTeam());
        Team[] teamPlayer = {
            new Team("Иванов иван", 24, 75, 180),
            new Team("Петров петр", 28, 81, 175),
            new Team("Сидоров сидр", 31, 89, 190),
            new Team("Жуков жук", 22, 71, 175),
        };

        for (Team teams : teamPlayer){
            System.out.println(teams + ", под номером:" + countPlayers++);
        }

        Course course = new Course(1000, 1000, 1000);
        System.out.println(course.infoCourse());

        for (Team teams : teamPlayer){
            System.out.println("К преодолению полосы препятсвий приступает игрок: " + teams.getPlayerName());
            playerTime = teams.doCourse(course);
            teamTime = teamTime + playerTime;
            System.out.println("Время прохождения препятвия составило:" + playerTime);
        }
        System.out.println("Время прохождения команды: " + team.getTeamNickName() + " составило: " + teamTime);
    }
}

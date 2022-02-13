package geekbrains.Lesson1_JavaCore_GB;



public class Course {

    private int swimLength, runLength, bicycleRace;
    final int maxTimeCourseSwim = 5;
    final int minTimeCourseSwim = 2;
    final int maxTimeCourseRun = 3;
    final int minTimeCourseRun = 1;
    final int maxtimeCoursebBicycleRace = 6;
    final int mintimeCoursebBicycleRace = 4;

    public Course (int swimLength, int runLength, int bicycleRace){
        this.swimLength = swimLength;
        this.runLength = runLength;
        this.bicycleRace = bicycleRace;
    }

    public int doCourseSwimLength(int age, int weight, int height){
        if (swimLength >= 750 || age <= 25 || weight <= 80 || height <= 185){
           return (int) (Math.random()*(maxTimeCourseSwim - minTimeCourseSwim) + 2);
        }
        return (int) ((Math.random()*(maxTimeCourseSwim - minTimeCourseSwim) + 2.5) + minTimeCourseSwim);
    }

    public int doCourseRunLength(int age, int weight, int height){
        if (runLength >= 750 || age <= 25 || weight <= 80 || height <= 185){
            return (int) (Math.random()*(maxTimeCourseRun - minTimeCourseRun) + 1.5);
        }
        return (int) ((Math.random()*(maxTimeCourseRun - minTimeCourseRun) + 3) + minTimeCourseRun);
    }

    public int doCourseBicycleRace(int age, int weight, int height){
        if (bicycleRace >= 750 || age <= 25 || weight <= 80 || height <= 185){
            return (int) (Math.random()*(maxtimeCoursebBicycleRace -
                mintimeCoursebBicycleRace) + 2.5);
        }
        return (int) ((Math.random()*(maxtimeCoursebBicycleRace - mintimeCoursebBicycleRace) + 2)
            + mintimeCoursebBicycleRace);
    }

    public String infoCourse() {
        return "Полоса предятсвий перед игроками составляет: плавание: " + swimLength + "м., бег: " + runLength
           + "м., велодлина: " + bicycleRace +"м.";
    }
}

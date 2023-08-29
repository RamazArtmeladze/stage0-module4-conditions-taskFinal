package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;

            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "Spring";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "Summer";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "Fall";
            } else {
                season = "Winter";
            }

            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }
}


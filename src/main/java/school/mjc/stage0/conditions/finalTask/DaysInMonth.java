package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth;

        switch (month) {
            case 2: // February
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                daysInMonth = 30;
                break;
            default: // January, March, May, July, August, October, December
                daysInMonth = 31;
                break;
        }

        System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


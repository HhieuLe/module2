package NextDayCalculator;

public class NextDayCalculator {

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int dayMonth(int month, int year) {
        int numOfDay = 0;


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numOfDay = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDay = 29;
                } else {
                    numOfDay = 28;
                }
                break;
            default:
                throw new IllegalStateException("unexpected value " + month);
        }
        return numOfDay;
    }

    public static String getNextDay(int day, int month, int year) {
        day++;
        if (day > dayMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        String strDay = day + "";
        String strMonth = month + "";
        String strYear = year + "";

        return strDay + "/" + strMonth + "/" + strYear;
    }
}

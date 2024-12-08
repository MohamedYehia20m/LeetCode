class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(noOfDaysFrom1970(date1) - noOfDaysFrom1970(date2));
    }

    public int noOfDaysFrom1970(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int daysTotal = 0;

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Total days contributed by full years since 1970
        int prevYear = year - 1;
        daysTotal += (prevYear - 1970 + 1) * 365; // Assume non-leap years
        daysTotal += countLeapYearsFrom1970(prevYear); // Add leap year corrections

        // Total days contributed by full months of the current year
        for (int i = 1; i < month; i++) {
            daysTotal += months[i - 1];
            if (i == 2 && isLeapYear(year)) { // Adjust February for leap year
                daysTotal += 1;
            }
        }

        // Add days in the current month
        daysTotal += day;

        return daysTotal;
    }

    // Helper method to count leap years from 1970 to a given year (inclusive)
    private int countLeapYearsFrom1970(int year) {
        int count = (year / 4) - (1970 / 4);
        count -= (year / 100) - (1970 / 100);
        count += (year / 400) - (1970 / 400);
        return count;
    }

    // Helper method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // public int noOfDaysFrom1970(String date) {
    //     int year = Integer.parseInt(date.substring(0, 4));
    //     int month = Integer.parseInt(date.substring(5, 7));
    //     int day = Integer.parseInt(date.substring(8));
    //     int daysTotal = 0;

    //     int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //     int prevYear = year - 1;

    //     for(int i = 1970; i <= prevYear; i++) {
    //         boolean isLeafYear = ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));
    //         daysTotal += isLeafYear?366:365;
    //     }

    //     for(int i = 1; i < month; i++) {
    //         if(i == 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    //             daysTotal += 29;
    //         } else {
    //             daysTotal += months[i - 1];
    //         }
            
    //     }

    //     return daysTotal + day;
        
    // } 
}
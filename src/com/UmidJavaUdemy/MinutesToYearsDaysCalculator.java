package com.UmidJavaUdemy;
/*Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
        TIPS:
        * Be extra careful about spaces in the printed message.
        * Use the remainder operator
        * 1 hour = 60 minutes
        * 1 day = 24 hours
        * 1 year = 365 days
        NOTES
        * The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
        * Do not add main method to solution code.
        * The solution will not be accepted if there are extra spaces */
public class MinutesToYearsDaysCalculator {
    //private static final String INVALID_VALUE_MSG = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(Constants.INVALID_VALUE_MSG);
        } else {
            long hour = minutes / 60 /24;
            long days =  hour % 365;
            long year =  hour / 365;
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}

package com.UmidJavaUdemy;

import java.time.temporal.ValueRange;

public class MethodOverload {
    private static final String INVALID_VALUE_MSG = "Invalid value";
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        ValueRange vr = ValueRange.of(0, 12);
        if(feet >= 0 && vr.isValidValue((long) inches)){
            double result = feet * 30.48 + (inches * 2.54);
            System.out.println(feet + " feet and " + inches + " inches are equal to " + result + "sm");
            return result;
        }
        else {
            System.out.println(INVALID_VALUE_MSG);
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double f = inches / 12;
            double i = f - Math.floor(f);
            System.out.println(inches + " inches are equal to " + f + " feet and " + i + " inches");
            return calcFeetAndInchesToCentimeters(f, i);
        } else {
            System.out.println(INVALID_VALUE_MSG);
            return -1;
        }
    }

    public static String getDurationString (int minutes, int seconds) {
            ValueRange vr = ValueRange.of(0, 59); // define check range
            if (minutes >= 0 && vr.isValidValue(seconds)) { // check if value is witin range
                int hours = (int) minutes / 60; // convert minutes to hours
                int minutesRemain = (int) minutes % 60; // take the remainder and put to minutes position
                int secondsRemain = (int) seconds % 60; // take the remainder and put to seconds position
                //add 0 to string if value is less than 10 so 1 hour will be 01 h
               String hourString = hours + "h ";
               String minuteString = minutesRemain + "m ";
               String secondsString = secondsRemain + "s";
               if(hours < 10) {
                   hourString = "0" + hourString;
               }
               if(minutesRemain <10){
                   minuteString = "0" + minuteString;
               }
               if(secondsRemain <10){
                   secondsString ="0" + secondsString;
               }
                System.out.println("It is equal to " +hourString + minuteString + secondsString);
                return hourString + minuteString + secondsString;
            } else {
                System.out.println(INVALID_VALUE_MSG);
                return INVALID_VALUE_MSG;

            }
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MSG);
            return INVALID_VALUE_MSG;
        }
        int minutesRemain = (int) seconds / 60;
        int secondsRemain = (int) seconds % 60;
        //System.out.println(seconds + " seconds are given");
        return getDurationString(minutesRemain, secondsRemain);
    }
}

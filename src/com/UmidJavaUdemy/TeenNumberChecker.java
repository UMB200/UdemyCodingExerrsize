package com.UmidJavaUdemy;
import java.time.temporal.ValueRange;
/*We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return
true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true
if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */
public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        ValueRange vr = ValueRange.of(13, 19);
        if(vr.isValidValue(a) || vr.isValidValue(b) || vr.isValidValue(c)){
            return true;
        }
        else
            return false;
    }
    public static boolean isTeen(int x){
        ValueRange vr = ValueRange.of(13, 19);
       return vr.isValidValue(x);
    }
}

package com.UmidJavaUdemy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if
two double numbers are the same up to three decimal places. Otherwise, return false.*/
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double dub1, double dub2){
        //return Math.floor(dub1 *1000) == Math.floor(dub2 * 1000); // works only if both parameters positive
//        BigDecimal bd1 = new BigDecimal(dub1);
//        BigDecimal bd2 = new BigDecimal(dub2);
//        bd1 = bd1.setScale(3, RoundingMode.HALF_UP);
//        bd2 = bd2.setScale(3, RoundingMode.HALF_UP);
//        return bd1.equals(bd2);
////           Double d1 = (double)Math.round(dub1 * 1000d);
////           Double d2 = (double)Math.round(dub2 * 1000d);
////           return  d1.equals(d2);
//        DecimalFormat df1 = new DecimalFormat("#.###");
//        DecimalFormat df2 = new DecimalFormat("#.###");
//        Double db1 = Double.valueOf(df1.format(dub1));
//        Double db2 = Double.valueOf(df2.format(dub2));
//        return  db1.equals(db2);
        if((int) (dub1 * 1000)== (int)(dub2 *1000)) {
            return true;
        }
        else return false;
    }
}

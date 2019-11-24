package com.UmidJavaUdemy;

public class Main {
    public static final String INVALID_VALUE_MSG = "Invalid Value";
    public static void main(String[] args) {
	// write your code here
//        SpeedConverter sp = new SpeedConverter();
//        double paramKiloMile = 100.4;
//        sp.toMilesPerHour(paramKiloMile);
//        sp.printConversion(paramKiloMile);
//        MegaBytesConverter mbc = new MegaBytesConverter();
//        int paramMb = 5000;
//        mbc.printMegaBytesAndKiloBytes(paramMb);
        MethodOverload mo = new MethodOverload();
//        double d1 = -1.0;
//        double d2 = 13.0;
//        double res = mo.calcFeetAndInchesToCentimeters(d1, d2);
//
//        double d3 = 156.0;
//        double res2 = mo.calcFeetAndInchesToCentimeters(d3);

        mo.getDurationString(65, 65);
        mo.getDurationString(-120);

    }


}


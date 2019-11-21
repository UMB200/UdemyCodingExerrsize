package com.UmidJavaUdemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SpeedConverter sp = new SpeedConverter();
        double paramKiloMile = 100.4;
        sp.toMilesPerHour(paramKiloMile);
        sp.printConversion(paramKiloMile);

        MegaBytesConverter mbc = new MegaBytesConverter();
        int paramMb = 5000;
        mbc.printMegaBytesAndKiloBytes(paramMb);
    }


}


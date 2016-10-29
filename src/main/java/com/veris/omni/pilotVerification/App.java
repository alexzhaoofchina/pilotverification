package com.veris.omni.pilotVerification;


import org.apache.commons.math.util.MathUtils;

import java.math.BigDecimal;
import java.util.function.Function;

public class App
{

    public static void main( String[] args )
    {
        System.out.println( "========================================" );

//      Function(String, boolean) selecter = (x) -> { return "1".equals(x); };
//      FileFilterTest.getFileFilter();
//      FileFilterTest.getFileFilter2();
//      FileFilterTest.getFileFilter3();
//      String str1 = OfferAttributeType.forValue(10).toString();
//      OfferAttributeType str2 = OfferAttributeType.forValue(11);
       
//        String str = (new OmniEnumMapper(OfferAttributeType.class)).ToEnumString(OfferAttributeType.OfferStatus);
//        System.out.println("OmniEnumMapper ToEnumString: " + str);
//
//        BackEndPriceType bept = (new OmniEnumMapper<BackEndPriceType>(BackEndPriceType.class)).Parse("1", BackEndPriceType.Unknown);
//        System.out.println("OmniEnumMapper Parse: " + bept.toString());
//
//        System.out.println( "========================================" );
//
//		String str1 = EnumMapper.<OfferAttributeType>ToEnumString(OfferAttributeType.OfferStatus);
//		System.out.println("EnumMapper ToEnumString: " + str1);
//
//		BackEndPriceType bept1 = EnumMapper.<BackEndPriceType>Parse("1", BackEndPriceType.Unknown);
//		System.out.println("EnumMapper Parse: " + bept1.toString());


        double d1 = MathUtils.round(1.575, 2, BigDecimal.ROUND_DOWN);
        double d2 = MathUtils.round(1.575, 2, BigDecimal.ROUND_HALF_UP);

        System.out.println(d1);
        System.out.println(d2);

    }

    double truncateDouble(double number, int numDigits) {
        double result = number;
        String arg = "" + number;
        int idx = arg.indexOf('.');
        if (idx != -1) {
            if (arg.length() > idx + numDigits) {
                arg = arg.substring(0,idx + numDigits+1);
                result = Double.parseDouble(arg);
            }
        }
        return result ;
    }

    private static long TENS[] = new long[19];

    static {
        TENS[0] = 1;
        for (int i = 1; i < TENS.length; i++) TENS[i] = 10 * TENS[i - 1];
    }

    public static double round(double v, int precision) {
        assert precision >= 0 && precision < TENS.length;
        double unscaled = v * TENS[precision];
        if(unscaled < Long.MIN_VALUE || unscaled > Long.MAX_VALUE)
            return v;
        long unscaledLong = (long) (unscaled + (v < 0 ? -10.5 : 0.5));
        return (double) unscaledLong / TENS[precision];
    }

    public double roundDouble(double d, int places) {
        return Math.round(d * Math.pow(10, (double) places)) / Math.pow(10, (double)places);
    }
    
}

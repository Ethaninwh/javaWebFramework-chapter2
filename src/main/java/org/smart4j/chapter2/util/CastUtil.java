package org.smart4j.chapter2.util;


public final class CastUtil {

    public static String castString(Object obj) {
        return castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    public static double castDouble(Object obj){
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue) {
        double value = defaultValue;
        if(obj != null){
            String stringValue = castString(obj);
            if(StringUtil.isNotEmpty(stringValue)){
                value = Double.parseDouble(stringValue);
            }
        }
        return value;
    }

    public static long castLong(Object obj){
        return castLong(obj, 0);
    }

    public static long castLong(Object obj, long defaultValue){
        long value = defaultValue;
        if(obj != null){
            String stringValue = castString(obj);
            if(StringUtil.isNotEmpty(stringValue)){
                value = Long.parseLong(stringValue);
            }
        }
        return value;
    }

    public static int castInt(Object obj){
        return castInt(obj, 0);
    }

    public static int castInt(Object obj, int defaultValue){
        int value = defaultValue;
        if(obj != null){
            String stringValue = castString(obj);
            if(StringUtil.isNotEmpty(stringValue)){
                value = Integer.parseInt(stringValue);
            }
        }
        return value;
    }

    public static boolean castBoolean(Object obj){
        return castBoolean(obj);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean value = defaultValue;
        if (obj != null){
            value = Boolean.parseBoolean(castString(obj));
        }
        return value;
    }
}

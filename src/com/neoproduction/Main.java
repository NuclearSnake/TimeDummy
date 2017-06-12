package com.neoproduction;

public class Main {

    public static void main(String[] args) {

    }

    public static String millisToString(long millis){
        long secs = millis/1000;
        millis -= secs*1000;
        if( secs < 60 )
            return timeToString(0,0,0,0, (int)secs, (int)millis);
        long minutes = secs / 60;
        secs -= minutes*60;
        if( minutes < 60 )
            return timeToString(0,0,0, (int)minutes, (int)secs, (int)millis);
        long hours = minutes / 60;
        minutes -= hours*60;
        if( hours < 24 )
            return timeToString(0,0,(int)hours, (int)minutes, (int)secs, (int)millis);
        long days = hours / 24;
        hours -= days*24;
        if( days < 365 )
            return timeToString(0,(int)days,(int)hours, (int)minutes, (int)secs, (int)millis);
        long years = days / 365;
        days -= years*365;

        return timeToString((int)years,(int)days,(int)hours, (int)minutes, (int)secs, (int)millis);
    }

    public static String timeToString(int years, int days, int hours, int minutes, int seconds, int millis){
        return (years+"y "+days+"d "+hours+"h "+minutes+"m "+seconds+"s "+millis+"ms");
    }
}

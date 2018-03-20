package com.useless.app.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Date;

public class TimeUtil {

    public static DateTime getDateTime(){
        return DateTime.now(DateTimeZone.UTC);
    }

    public static Date getDate(){
        return DateTime.now(DateTimeZone.UTC).toDate();
    }

}

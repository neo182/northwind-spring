package no.satyam.spring.northwind.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author srt
 */ 
public class DateTimeUtil {

    private static final Logger log = LoggerFactory.make();

    public static String formatTime(Time time, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(time.getTime()));
    }

    public static String formatTimeStamp(Timestamp timestamp, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(timestamp);
    }

    public static String formatSqlDato(java.sql.Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static String formatUtilDato(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static Time parseStringTilTime(String timeStampString, String pattern) {
        java.util.Date utilDate = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            utilDate = simpleDateFormat.parse(timeStampString);
        } catch (ParseException parseException) {
            log.debug("Fikk problem ved å parse String til java.sql.Time pga datomønster " + pattern, parseException);
        }
        return new Time(utilDate.getTime());
    }

    public static Timestamp parseStringTilTimeStamp(String timeStampString, String pattern) {
        Date utilDate = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            utilDate = simpleDateFormat.parse(timeStampString);
        } catch (ParseException parseException) {
            log.debug("Fikk problem ved å parse String til java.sql.Timestamp pga datomønster " + pattern, parseException);
        }
        return new Timestamp(utilDate.getTime());
    }

    public static java.sql.Date parseStringTilSqlDate(String datoString, String pattern) {
        Date utilDate = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            utilDate = simpleDateFormat.parse(datoString);
        } catch (ParseException parseException) {
            log.debug("Fikk problem ved å parse String til java.sql.Date pga datomønster " + pattern, parseException);
        }
        return new java.sql.Date(utilDate.getTime());
    }

    public static Date parseStringTilUtilDate(String datoString, String pattern) {
        Date sqlDate = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            sqlDate = simpleDateFormat.parse(datoString);
        } catch (ParseException parseException) {
            log.debug("Fikk problem ved å parse String til java.sql.Date pga datomønster " + pattern, parseException);
        }
        return sqlDate;
    }
}

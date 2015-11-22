package no.satyam.spring.northwind.util;

import org.apache.log4j.Logger;

/**
 * The original source is from Dr. Heinz Kabbutz See
 * http://www.javaspecialists.eu/archive/Issue137.html for details
 *
 * @author satyam
 */
public class LoggerFactory {

    public static Logger make() {
        Throwable throwable = new Throwable();
        StackTraceElement directCaller = throwable.getStackTrace()[1];
        return Logger.getLogger(directCaller.getClassName());
    }

    public static org.slf4j.Logger makeSlf4j() {
        Throwable throwable = new Throwable();
        StackTraceElement directCaller = throwable.getStackTrace()[1];
        return org.slf4j.LoggerFactory.getLogger(directCaller.getClassName());
    }
}

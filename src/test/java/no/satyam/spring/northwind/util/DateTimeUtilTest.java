package no.satyam.spring.northwind.util;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static no.satyam.spring.northwind.util.DateTimeUtil.*;

/**
 *
 * @author srt
 */
public class DateTimeUtilTest {
    
    private static final Logger log = LoggerFactory.make();
    private Date testDate;
    private final String testDatoStr = "31/12/2014";

    @BeforeClass(groups = {"unit"})
    public void setUp() throws ParseException {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(NorthWindConstants.DATE_FORMAT_WITH_DASH);
        java.util.Date utilDato = simpleDateFormat1.parse(testDatoStr);

        testDate = new Date(utilDato.getTime());
    }


    @Test(groups = {"unit"})
    public void testFormatDato() {
        // Act
        String datoStringFound = formatSqlDato(testDate, NorthWindConstants.DATE_FORMAT_WITH_DASH);
        log.debug("datoStringFound : " + datoStringFound);
        // Assert
        assertEquals(testDatoStr, datoStringFound);

    }

    @Test(groups = {"unit"})
    public void testParseStringTilDate() throws Exception {
        // Act
        Date datoFound = parseStringTilSqlDate(testDatoStr, NorthWindConstants.DATE_FORMAT_WITH_DASH);
        log.debug("datoFound : " + datoFound);
        // Assert
        assertEquals(testDate, datoFound);

    }
   
}

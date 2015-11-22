package no.satyam.spring.northwind.util;

import org.apache.log4j.Logger;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class LoggerFactoryTest {

    @Test(groups = {"unit"})
    public void testMakeWorksProperly() {
        Logger log = LoggerFactory.make();
        assertNotNull(log);
    }

    @Test(groups = {"unit"})
    public void testMakeSlf4jWorksProperly() {
        org.slf4j.Logger log = LoggerFactory.makeSlf4j();
        assertNotNull(log);
    }

}

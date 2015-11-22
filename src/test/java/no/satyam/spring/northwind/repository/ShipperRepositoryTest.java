package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Shipper;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class ShipperRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private ShipperRepository repository;

    @Test
    public void testSaveShipper() {

        Shipper shipper = new Shipper("testCompanyName", "8754645");
        repository.save(shipper);
        assertNotNull(shipper.getId());
        logger.debug("shipperId : " + shipper.getId());

    }

    @Test
    public void testFindByCompanyName() {

        Shipper shipperFound = repository.findByCompanyName("Speedy Express");
        assertNotNull(shipperFound);
        logger.debug(shipperFound.toString());

    }

    @Test
    public void testFindOne() {

        Shipper shipperFound = repository.findOne(1L);
        assertNotNull(shipperFound);
        logger.debug(shipperFound.toString());

    }

}

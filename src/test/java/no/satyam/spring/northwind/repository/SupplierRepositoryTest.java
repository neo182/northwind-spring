package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class SupplierRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private SupplierRepository respository;

    @Test
    public void testSaveSupplier() {

        Supplier supplier = getSupplierForTest();
        respository.save(supplier);
        assertNotNull(supplier.getId());
        logger.debug("supplierId : " + supplier.getId());

    }

    @Test
    public void testFindByCompanyName() {
        
        List<Supplier> supplierListFound = respository.findByCompanyName("Exotic Liquids");
        assertNotNull(supplierListFound);
        logger.debug("supplierListFound size : " + supplierListFound.size());

    }

    @Test
    public void testFindByContactName() {

        List<Supplier> supplierListFound = respository.findByContactName("Shelley Burke");
        assertNotNull(supplierListFound);
        logger.debug("supplierListFound size : " + supplierListFound.size());

    }

    @Test
    public void testFindByContactTitle() {

        List<Supplier> supplierListFound = respository.findByContactTitle("Order Administrator");
        assertNotNull(supplierListFound);
        logger.debug("supplierListFound size : " + supplierListFound.size());

    }

    @Test
    public void testFindByCountry() {

        List<Supplier> supplierListFoundFound = respository.findByCountry("USA");
        assertNotNull(supplierListFoundFound);
        logger.debug("supplierListFound size : " + supplierListFoundFound.size());

    }

    private Supplier getSupplierForTest() {

        Supplier supplier = new Supplier();
        supplier.setCompanyName("TestCompanyName");
        supplier.setContactName("TestContactName");
        supplier.setContactTitle("TestContactTitle");
        supplier.setAddress("TestAddress");
        supplier.setCity("TestCity");
        supplier.setRegion("TestRegion");
        supplier.setPostalCode("9999");
        supplier.setCountry("TestCountry");
        supplier.setPhone("987845");
        supplier.setFax("4566455");

        return supplier;

    }

}

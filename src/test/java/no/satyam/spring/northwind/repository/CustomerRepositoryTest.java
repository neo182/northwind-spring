package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class CustomerRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    public void testSaveCustomer() {

        Customer customer = getCustomerForTest();
        repository.save(customer);
        assertNotNull(customer.getId());
        logger.debug("customerId : " + customer.getId());

    }

    @Test
    public void testFindByCompanyName() {

        List<Customer> customerListFound = repository.findByCompanyName("Alfreds Futterkiste");
        assertNotNull(customerListFound);
        logger.debug("customerList size : " + customerListFound.size());

    }

    @Test
    public void testFindByContactName() {

        List<Customer> customerListFound = repository.findByContactName("Maria Anders");
        assertNotNull(customerListFound);
        logger.debug("customerList size : " + customerListFound.size());

    }

    @Test
    public void testFindByContactTitle() {

        List<Customer> customerListFound = repository.findByContactTitle("Sales Representative");
        assertNotNull(customerListFound);
        logger.debug("customerList size : " + customerListFound.size());

    }

    @Test
    public void testFindByCountry() { 

        List<Customer> customerListFound = repository.findByCountry("Germany");
        assertNotNull(customerListFound);
        logger.debug("customerList size : " + customerListFound.size());

    }

    private Customer getCustomerForTest() {

        Customer customer = new Customer();
        customer.setCompanyName("TestCompanyName");
        customer.setContactName("TestContactName");
        customer.setContactTitle("TestContactTitle");
        customer.setAddress("TestAddress");
        customer.setCity("TestCity");
        customer.setRegion("TestRegion");
        customer.setPostalCode("9999");
        customer.setCountry("TestCountry");
        customer.setPhone("987845");
        customer.setFax("4566455");
        return customer;

    }

}

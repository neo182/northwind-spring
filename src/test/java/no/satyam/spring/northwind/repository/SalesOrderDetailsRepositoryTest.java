package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Product;
import no.satyam.spring.northwind.domain.SalesOrder;
import no.satyam.spring.northwind.domain.SalesOrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class SalesOrderDetailsRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private SalesOrderDetailsRepository repository;

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveSalesOrderDetails() {
        
        SalesOrderDetails orderDetails = getSalesOrderDetailForTest();
        repository.save(orderDetails);
        assertNotNull(orderDetails.getId());
        logger.debug("salesOrderDetailsId : " + orderDetails.getId());
        
    }

    private SalesOrderDetails getSalesOrderDetailForTest() {
        SalesOrderDetails orderDetails = new SalesOrderDetails();
        
        SalesOrder order = salesOrderRepository.findOne(1L);
        orderDetails.setSalesOrder(order);
        
        Product product = productRepository.findOne(1L);
        orderDetails.setProduct(product);
        
        return orderDetails;
    }

}

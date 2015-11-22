package no.satyam.spring.northwind.repository;

import java.sql.Date;
import java.util.List;
import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Customer;
import no.satyam.spring.northwind.domain.Employee;
import no.satyam.spring.northwind.domain.SalesOrder;
import no.satyam.spring.northwind.domain.Shipper;
import no.satyam.spring.northwind.util.DateTimeUtil;
import no.satyam.spring.northwind.util.NorthWindConstants;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class SalesOrderRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private SalesOrderRepository repository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ShipperRepository shipperRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveOrder() {
        SalesOrder order = getSalesOrderForTest();
        repository.save(order);
        assertNotNull(order.getId());
        logger.debug("orderId : " + order.getId());
    }

    @Test
    public void testFindSalesOrderByCustomer() {

        Customer customer = customerRepository.findOne(1L);
        List<SalesOrder> salesOrderList
                = repository.findByCustomer(customer);
        assertNotNull(salesOrderList);
        logger.debug("salesOrderList size : " + salesOrderList.size());

    }

    @Test
    public void testFindSalesOrderByEmployee() {

        Employee employee = employeeRepository.findOne(1L);
        List<SalesOrder> salesOrderList
                = repository.findByEmployee(employee);
        assertNotNull(salesOrderList);
        logger.debug("salesOrderList size : " + salesOrderList.size());

    }

    @Test
    public void testFindSalesOrderByShipper() {

        Shipper shipper = shipperRepository.findOne(1L);
        List<SalesOrder> salesOrderList
                = repository.findByShipper(shipper);
        assertNotNull(salesOrderList);
        logger.debug("salesOrderList size : " + salesOrderList.size());

    }
    
    @Test
    public void testFindByOrderDateBetween() {
        
        String orderDateStartStr = "1996-07-04";
        Date orderDateStart = DateTimeUtil.parseStringTilSqlDate(orderDateStartStr, 
                NorthWindConstants.DATE_FORMAT_WITH_MINUS);
        
        String orderDateEndStr = "1996-08-04";
        Date orderDateEnd = DateTimeUtil.parseStringTilSqlDate(orderDateEndStr, 
                NorthWindConstants.DATE_FORMAT_WITH_MINUS);

        List<SalesOrder> salesOrderList
                = repository.findByOrderDateBetween(orderDateStart, orderDateEnd);
        assertNotNull(salesOrderList);
        logger.debug("salesOrderList size : " + salesOrderList.size());

    }

    private SalesOrder getSalesOrderForTest() {
        SalesOrder order = new SalesOrder();

        Customer customer = customerRepository.findOne(1L);
        order.setCustomer(customer);

        Employee employee = employeeRepository.findOne(1L);
        order.setEmployee(employee);

        Shipper shipper = shipperRepository.findOne(1L);
        order.setShipper(shipper);

        return order;

    }

}

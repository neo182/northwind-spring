package no.satyam.spring.northwind.repository;

import java.sql.Date;
import java.util.List;
import no.satyam.spring.northwind.domain.Customer;
import no.satyam.spring.northwind.domain.Employee;
import no.satyam.spring.northwind.domain.SalesOrder;
import no.satyam.spring.northwind.domain.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {

    List<SalesOrder> findByCustomer(Customer customer);

    List<SalesOrder> findByEmployee(Employee employee);

    List<SalesOrder> findByShipper(Shipper shipper);

    List<SalesOrder> findByOrderDateBetween(Date startOrderDate, Date endOrderDate);

}

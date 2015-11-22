package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByCompanyName(String companyName);

    List<Customer> findByContactName(String contactName);

    List<Customer> findByContactTitle(String contactTitle);

    List<Customer> findByCountry(String country);

}

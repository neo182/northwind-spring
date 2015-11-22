package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByCompanyName(String companyName);

    List<Supplier> findByContactName(String contactName);

    List<Supplier> findByContactTitle(String contactTitle);

    List<Supplier> findByCountry(String country);
}

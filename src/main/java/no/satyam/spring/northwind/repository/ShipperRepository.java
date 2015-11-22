package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface ShipperRepository extends JpaRepository<Shipper, Long> {
    Shipper findByCompanyName(String companyName);
}

package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.SalesOrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface SalesOrderDetailsRepository extends JpaRepository<SalesOrderDetails, Long>{
    
}

package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>{
    ApplicationUser findByUserName(String userName);
    
}

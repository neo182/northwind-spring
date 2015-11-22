package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
    
}

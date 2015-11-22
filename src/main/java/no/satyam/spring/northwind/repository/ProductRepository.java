package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.Category;
import no.satyam.spring.northwind.domain.Product;
import no.satyam.spring.northwind.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductName(String productName);

    List<Product> findByCategory(Category category);

    List<Product> findBySupplier(Supplier supplier);

}

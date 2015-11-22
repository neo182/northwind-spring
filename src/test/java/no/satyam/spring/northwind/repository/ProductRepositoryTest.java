package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Category;
import no.satyam.spring.northwind.domain.Product;
import no.satyam.spring.northwind.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class ProductRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Test
    public void testSaveEmployee() {

        Product product = getProductForTest();
        repository.save(product);
        assertNotNull(product.getId());
        logger.debug("productId : " + product.getId());

    }

    @Test
    public void testFindProductByCategory() {

        Category category = categoryRepository.findOne(1L);
        List<Product> productList
                = repository.findByCategory(category);
        assertNotNull(productList);
        logger.debug("productList size : " + productList.size());

    }
    
    @Test
    public void testFindProductBySupplier() {

        Supplier supplier = supplierRepository.findOne(1L);
        List<Product> productList
                = repository.findBySupplier(supplier);
        assertNotNull(productList);
        logger.debug("productList size : " + productList.size());

    }

    private Product getProductForTest() {
        Product product = new Product();
        product.setProductName("testProduct");
        Category category = categoryRepository.findOne(1L);
        product.setCategory(category);
        Supplier supplier = supplierRepository.findOne(1L);
        product.setSupplier(supplier);
        return product;
    }

}

package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author srt
 */
public class CategoryRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private CategoryRepository repository;

    @Test
    public void testSaveCategory() {

        Category category = new Category("testCategory", "Test description");
        Category categorySaved = repository.save(category);
        logger.debug("categoryId : " + categorySaved.getId());
        assertNotNull(categorySaved.getId());

    }

    @Test
    public void testFindByName() {

        Category categoryFound = repository.findByName("Beverages");
        logger.debug("categoryFound : " + categoryFound.toString());
        assertNotNull(categoryFound);

    }
    
}

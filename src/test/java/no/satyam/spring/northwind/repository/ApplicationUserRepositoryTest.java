package no.satyam.spring.northwind.repository;

import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class ApplicationUserRepositoryTest extends AbstractIntegrationTest {

    

    @Autowired
    ApplicationUserRepository repository;

    @Test
    public void testSaveApplicationUser() {

        ApplicationUser user = new ApplicationUser("testUser", "password");
        ApplicationUser userFound = repository.save(user);
        logger.debug("userId : " + userFound.getId());
        assertNotNull(userFound.getId());

    }

    @Test 
    public void testFindByUserName() {

        ApplicationUser userFound = repository.findByUserName("srt");
        logger.debug("userFound : " + userFound.toString());
        assertNotNull(userFound);

    }

}

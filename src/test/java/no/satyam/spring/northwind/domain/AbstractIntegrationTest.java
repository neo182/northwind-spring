package no.satyam.spring.northwind.domain;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import no.satyam.spring.northwind.ApplicatonConfigTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author srt
 */
@ContextConfiguration(classes = {ApplicatonConfigTest.class})
public class AbstractIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    DataSource dataSource;

    @BeforeClass
    public void populateDatabase() throws SQLException {

        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("data.sql"));

        Connection connection = null;

        try {
            connection = DataSourceUtils.getConnection(dataSource);
            populator.populate(connection);
        } finally {
            if (connection != null) {
                DataSourceUtils.releaseConnection(connection, dataSource);
            }
        }
    }
}

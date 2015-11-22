package no.satyam.spring.northwind;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This configuration is responsible for the testing
 *
 * @author srt
 */
@Configuration
@EnableJpaRepositories
@Import(InfrastructureConfigTest.class)
public class ApplicatonConfigTest {

}

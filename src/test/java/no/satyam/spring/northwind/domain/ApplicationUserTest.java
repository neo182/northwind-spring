package no.satyam.spring.northwind.domain;

import no.satyam.spring.northwind.ApplicatonConfigTest;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author srt
 */
public class ApplicationUserTest {
    @Test
    public void bootstrapAppFromJavaConfig() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicatonConfigTest.class);
        assertThat(context, is(notNullValue()));
        assertThat(context.getBean(ApplicationUser.class), is(notNullValue()));
    }
    
}

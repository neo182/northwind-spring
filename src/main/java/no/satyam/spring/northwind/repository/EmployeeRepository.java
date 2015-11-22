package no.satyam.spring.northwind.repository;

import java.util.List;
import no.satyam.spring.northwind.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author srt
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

    //@Query("select first u from Employee u where u.firstName =?1 and u.lastName =?2")
    //Employee findByFirstNameAndLastName(String firstName, String lastName);

    List<Employee> findByCountry(String country);
    
    List<Employee> findByTitle(String title);

}

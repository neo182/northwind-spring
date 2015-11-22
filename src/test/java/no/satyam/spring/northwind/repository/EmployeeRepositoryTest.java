package no.satyam.spring.northwind.repository;

import java.sql.Date;
import java.util.List;
import no.satyam.spring.northwind.domain.AbstractIntegrationTest;
import no.satyam.spring.northwind.domain.Employee;
import static no.satyam.spring.northwind.util.DateTimeUtil.parseStringTilSqlDate;
import no.satyam.spring.northwind.util.NorthWindConstants;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author srt
 */
public class EmployeeRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void testSaveEmployee() {

        Employee employee = getEmployeeForTest();
        repository.save(employee);
        assertNotNull(employee.getId());
        logger.debug("employeeId : " + employee.getId());

    }

    @Test
    public void testFindByFirstName() {

        List<Employee> employeeList = repository.findByFirstName("Davolio");
        assertNotNull(employeeList);
        logger.debug("employeeList size : " + employeeList.size());

    }

    @Test
    public void testFindByLastName() {

        List<Employee> employeeList = repository.findByLastName("Nancy");
        assertNotNull(employeeList);
        logger.debug("employeeList size : " + employeeList.size());

    }

    @Test
    public void testFindByCountry() {

        List<Employee> employeeList = repository.findByCountry("USA");
        assertNotNull(employeeList);
        logger.debug("employeeList size : " + employeeList.size());

    }

    private Employee getEmployeeForTest() {

        Employee employee = new Employee();
        employee.setFirstName("testFirstName");
        employee.setLastName("testLastName");
        employee.setTitle("testTile");
        employee.setTitleOfCourtesy("testMr");
        String birthDateString = "12/08/1968";
        Date bithDate = parseStringTilSqlDate(birthDateString, NorthWindConstants.DATE_FORMAT_WITH_DASH);
        employee.setBirthDate(bithDate);
        String hireDateString = "5/1/1992";
        Date hireDate = parseStringTilSqlDate(hireDateString, NorthWindConstants.DATE_FORMAT_WITH_DASH);
        employee.setHireDate(hireDate);
        employee.setAddress("testAddress");
        employee.setCity("testCity");
        employee.setRegion("testRegion");
        employee.setPostalCode("testPostalCode");
        employee.setCountry("testCountry");
        employee.setHomePhone("12313121");
        employee.setExtension("testExtension");
        employee.setNotes("testNotes");

        return employee;
    }

}

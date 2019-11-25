import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

//    @Before
//    public void before(){
//        employee = new Employee("Raf", 505, 1000)
//    }

    @Test
    public void managerAsEmployee(){
        employee = new Manager("Raf", 505, 1000, "Luxury");
        assertEquals("Raf", employee.getName());
        assertEquals(505, employee.getNiNumber());
        assertEquals(1000, employee.getSalary());
//        assertEquals(2000.0, employee.raiseSalary(Double double));
//        assertEquals();

    }

}

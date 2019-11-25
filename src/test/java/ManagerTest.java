import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Raf", 505, 1000, "Luxury");
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Luxury", manager.getDeptName());
    }
}

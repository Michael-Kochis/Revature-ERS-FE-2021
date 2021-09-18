package tests.junit;

import com.revature.mikeworks.enums.ERSUserRoles;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ERSUserRolesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void instantiates() {
        ERSUserRoles ERSTest = ERSUserRoles.EMPLOYEE;

        assertNotNull(ERSTest);
    }

    @Test
    public void zeroIsEmployee() {
        ERSUserRoles result = ERSUserRoles.fromInt(0);

        assertEquals(ERSUserRoles.EMPLOYEE, result);
    }

    @Test
    public void oneIsManager() {
        ERSUserRoles result = ERSUserRoles.fromInt(1);

        assertEquals(ERSUserRoles.MANAGER, result);
    }

    @Test
    public void employeeIsZero() {
        int result = ERSUserRoles.toInt(ERSUserRoles.EMPLOYEE);

        assertEquals(0, result);
    }

    @Test
    public void managerIsOne() {
        int result = ERSUserRoles.toInt(ERSUserRoles.MANAGER);

        assertEquals(1, result);
    }

    @Test
    public void toStringEmployee() {
        String result = ERSUserRoles.toString(ERSUserRoles.EMPLOYEE);

        assertEquals("EMPLOYEE", result);
    }

    @Test
    public void toStringManager() {
        String result = ERSUserRoles.toString(ERSUserRoles.MANAGER);

        assertEquals("MANAGER", result);
    }
}
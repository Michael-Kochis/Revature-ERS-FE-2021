package tests.junit;

import com.revature.mikeworks.enums.ERSReimbursementStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ERSReimbursementStatusTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void instantiates() {
        ERSReimbursementStatus ERSTest = ERSReimbursementStatus.PENDING;

        assertNotNull(ERSTest);
    }

    @Test
    public static void zeroIsPending() {
        ERSReimbursementStatus result = ERSReimbursementStatus.fromInt(0);

        assertEquals(ERSReimbursementStatus.PENDING, result);
    }

    @Test
    public static void oneIsApproved() {
        ERSReimbursementStatus result = ERSReimbursementStatus.fromInt(1);

        assertEquals(ERSReimbursementStatus.APPROVED, result);
    }

    @Test
    public static void twoIsDenied() {
        ERSReimbursementStatus result = ERSReimbursementStatus.fromInt(2);

        assertEquals(ERSReimbursementStatus.DENIED, result);
    }

    @Test
    public static void pendingIsZero() {
        int result = ERSReimbursementStatus.toInt(ERSReimbursementStatus.PENDING);

        assertEquals(0, result);
    }

    @Test
    public static void approvedIsOne() {
        int result = ERSReimbursementStatus.toInt(ERSReimbursementStatus.APPROVED);

        assertEquals(1, result);
    }

    @Test
    public static void deniedIsTwo() {
        int result = ERSReimbursementStatus.toInt(ERSReimbursementStatus.DENIED);

        assertEquals(2, result);
    }

    @Test
    public static void toStringPending() {
        String result = ERSReimbursementStatus.toString(ERSReimbursementStatus.PENDING);

        assertEquals("PENDING", result);
    }

    @Test
    public static void toStringApproved() {
        String result = ERSReimbursementStatus.toString(ERSReimbursementStatus.APPROVED);

        assertEquals("PENDING", result);
    }

    @Test
    public static void toStringDenied() {
        String result = ERSReimbursementStatus.toString(ERSReimbursementStatus.DENIED);

        assertEquals("PENDING", result);
    }

}
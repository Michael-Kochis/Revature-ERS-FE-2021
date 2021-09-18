package tests.junit;

import com.revature.mikeworks.enums.ERSReimbursementType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ERSReimbursementTypeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ERSReimbursementType ERSType = ERSReimbursementType.OTHER;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void instantiates() {
        ERSReimbursementType ERSType = ERSReimbursementType.OTHER;
        assertNotNull(ERSType);
    }

    @Test
    public void zeroisOther() {
        ERSReimbursementType result = ERSReimbursementType.fromInt(0);

        assertEquals(ERSReimbursementType.OTHER, result);
    }

    @Test
    public void oneIsLodging() {
        ERSReimbursementType result = ERSReimbursementType.fromInt(1);

        assertEquals(ERSReimbursementType.LODGING, result);
    }

    @Test
    public void twoIsTravel() {
        ERSReimbursementType result = ERSReimbursementType.fromInt(2);

        assertEquals(ERSReimbursementType.TRAVEL, result);
    }

    @Test
    public void threeIsFood() {
        ERSReimbursementType result = ERSReimbursementType.fromInt(3);

        assertEquals(ERSReimbursementType.FOOD, result);
    }

    @Test
    public void otherIszero() {
        int result = ERSReimbursementType.toInt(ERSReimbursementType.OTHER);

        assertEquals(0, result);
    }

    @Test
    public void lodgingIsOne() {
        int result = ERSReimbursementType.toInt(ERSReimbursementType.LODGING);

        assertEquals(1, result);
    }

    @Test
    public void travelIsTwo() {
        int result = ERSReimbursementType.toInt(ERSReimbursementType.TRAVEL);

        assertEquals(2, result);
    }

    @Test
    public void foodIsThree() {
        int result = ERSReimbursementType.toInt(ERSReimbursementType.FOOD);

        assertEquals(3, result);
    }

    @Test
    public void zeroisOthertoString() {
        String result = ERSReimbursementType.toString(0);

        assertEquals("OTHER", result);
    }

    @Test
    public void oneIsLodgingtoString() {
        String result = ERSReimbursementType.toString(1);

        assertEquals("LODGING", result);
    }

    @Test
    public void twoIsTraveltoString() {
        String result = ERSReimbursementType.toString(2);

        assertEquals("TRAVEL", result);
    }

    @Test
    public void threeIsFoodtoString() {
        String result = ERSReimbursementType.toString(3);

        assertEquals("FOOD", result);
    }

}
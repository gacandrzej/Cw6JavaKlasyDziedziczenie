package rekord;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartfonTest {

    private Smartfon smartfon;

    @BeforeEach
    void setUp() {
        smartfon = new Smartfon("Samsung", "Galaxy S21", 2022, "Android", 128);
    }

    @Test
    void testAccessors() {
        assertEquals("Samsung", smartfon.producent());
        assertEquals("Galaxy S21", smartfon.model());
        assertEquals(2022, smartfon.rokProdukcji());
        assertEquals("Android", smartfon.systemOperacyjny());
        assertEquals(128, smartfon.ilośćPamięci());
    }

    @Test
    void testToString() {
        String expected = "SmartfonRecord[producent=Samsung, model=Galaxy S21, rokProdukcji=2022, systemOperacyjny=Android, ilośćPamięci=128]";
        assertEquals(expected, smartfon.toString());
    }

    @Test
    void testEqualsAndHashCode() {
        // Dwa identyczne obiekty powinny być równe i mieć ten sam hashCode
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "Android", 128);
        assertEquals(smartfon, smartfon2);
        assertEquals(smartfon.hashCode(), smartfon2.hashCode());
    }

    @Test
    void testNotEquals() {
        // Dwa różne obiekty nie powinny być równe
        Smartfon smartfon2 = new Smartfon("Apple", "iPhone 13", 2021, "iOS", 256);
        assertNotEquals(smartfon, smartfon2);
    }
}
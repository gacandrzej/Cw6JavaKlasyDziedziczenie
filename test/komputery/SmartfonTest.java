package komputery;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartfonTest {

    private Smartfon smartfon;

    @BeforeEach
    void setUp() {
        smartfon = new Smartfon("Samsung", "Galaxy S21", 2022, "Android",128);
    }

    @AfterEach
    void tearDown() {
        smartfon = null;
    }

    @Test
    void getProducent() {
        assertEquals("Samsung", smartfon.getProducent());
    }

    @Test
    void setProducent() {
        smartfon.setProducent("Apple");
        assertEquals("Apple", smartfon.getProducent());
    }

    @Test
    void getIlośćPamięci() {
        assertEquals(128, smartfon.getIlośćPamięci());
    }

    @Test
    void setIlośćPamięci() {
        smartfon.setIlośćPamięci(256);
        assertEquals(256, smartfon.getIlośćPamięci());
    }

    @Test
    void testToString() {
        assertEquals("Komputer{producent='Samsung', model='Galaxy S21', rokProdukcji=2022}Smartfon{systemOperacyjny='Android', ilośćPamięci=128}", smartfon.toString());
    }


    @Test
    void testEquals() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "Android",128);
        assertEquals(smartfon, smartfon2);
    }

    @Test
    void testHashCode() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "Android",128);
        assertEquals(smartfon.hashCode(), smartfon2.hashCode());
    }

    @Test
    void testEqualsDifferentProducer() {
        Smartfon smartfon2 = new Smartfon("Apple", "iPhone 13", 2021, "Android",128);
        assertNotEquals(smartfon, smartfon2);
    }

    @Test
    void testEqualsDifferentModel() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S22", 2023, "Android",128);
        assertNotEquals(smartfon, smartfon2);
    }

    @Test
    void testEqualsDifferentYear() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2021, "Android",128);
        assertNotEquals(smartfon, smartfon2);
    }

    @Test
    void testEqualsDifferentOS() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "iOS",128);
        assertNotEquals(smartfon, smartfon2);
    }

    @Test
    void testEqualsDifferentObject() {
        Komputer komputer = new Komputer("Dell", "XPS 15", 2020);
        assertNotEquals(smartfon, komputer);
    }

    @Test
    void getSystemOperacyjny() {
        assertEquals("Android", smartfon.getSystemOperacyjny());
    }

    @Test
    void setSystemOperacyjny() {
        smartfon.setSystemOperacyjny("iOS");
        assertEquals("iOS", smartfon.getSystemOperacyjny());
    }

    @Test
    void testEqualsNull() {
        assertNotEquals(smartfon, null);
    }

    @Test
    void testEqualsDifferentMemory() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "Android",256);
        assertNotEquals(smartfon, smartfon2);
    }

}
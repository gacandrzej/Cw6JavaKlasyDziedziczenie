package sealed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartfonTest {

    private Smartfon smartfon;

    @BeforeEach
    void setUp() {
        smartfon = new Smartfon("Samsung", "Galaxy S21", 2022, "Android", 128);
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
    void getModel() {
        assertEquals("Galaxy S21", smartfon.getModel());
    }

    @Test
    void getRokProdukcji() {
        assertEquals(2022, smartfon.getRokProdukcji());
    }

    @Test
    void getSystemOperacyjny() {
        assertEquals("Android", smartfon.getSystemOperacyjny());
    }

    @Test
    void getIlośćPamięci() {
        assertEquals(128, smartfon.getIlośćPamięci());
    }

    @Test
    void testToString() {
        // Zakładając, że toString() w klasie bazowej Komputer jest poprawnie zaimplementowane
        // i Smartfon.toString() je rozszerza.
        String expected = "Komputer{producent='Samsung', model='Galaxy S21', rokProdukcji=2022}Smartfon{systemOperacyjny='Android', ilośćPamięci=128}";
        assertEquals(expected, smartfon.toString());
    }

    @Test
    void włacz() {
        // Test metody z efektem ubocznym (wydruk na konsolę)
        // W bardziej zaawansowanych scenariuszach można by przechwycić strumień wyjścia.
        // Tutaj po prostu sprawdzamy, czy metoda się wykona bez błędu.
        smartfon.włacz();
    }

    @Test
    void testEqualsAndHashCode() {
        Smartfon smartfon2 = new Smartfon("Samsung", "Galaxy S21", 2022, "Android", 128);
        assertEquals(smartfon, smartfon2, "Dwa identyczne smartfony powinny być równe.");
        assertEquals(smartfon.hashCode(), smartfon2.hashCode(), "HashCode dla równych obiektów powinien być taki sam.");

        Smartfon smartfon3 = new Smartfon("Apple", "iPhone 13", 2021, "iOS", 256);
        assertNotEquals(smartfon, smartfon3, "Dwa różne smartfony nie powinny być równe.");
    }
}
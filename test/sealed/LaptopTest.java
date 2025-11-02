package sealed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {
    private Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8.0f);
    }

    @AfterEach
    void tearDown() {
        laptop = null;
    }

    @Test
    void testGetters() {
        assertEquals("Dell", laptop.getProducent());
        assertEquals("XPS 15", laptop.getModel());
        assertEquals(2022, laptop.getRokProdukcji());
        assertEquals(1.8, laptop.getWaga());
        assertEquals(3, laptop.getIloscPortowUSB());
        assertEquals(8.0f, laptop.getCzasPracyNaBaterii());
    }

    @Test
    void testToString() {
        // Zakładając, że toString() w klasie bazowej Komputer jest poprawnie zaimplementowane
        // i Laptop.toString() je rozszerza.
        String expected = "Laptop{" +
                "producent='" + "Dell" + '\'' +
                ", model='" + "XPS 15" + '\'' +
                ", rokProdukcji=" + 2022 +
                ", waga=" + 1.8 +
                ", iloscPortowUSB=" + 3 +
                ", czasPracyNaBaterii=" + 8.0f +
                '}';
        assertEquals(expected, laptop.toString());
    }

    @Test
    void włacz() {
        // Prosty test wykonania metody
        laptop.włacz();
    }

    @Test
    void testEqualsAndHashCode() {
        // Test równości
        Laptop laptop2 = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8.0f);
        assertEquals(laptop, laptop2, "Dwa identyczne laptopy powinny być równe.");
        assertEquals(laptop.hashCode(), laptop2.hashCode(), "HashCode dla równych obiektów powinien być taki sam.");

        // Test nierówności - inny producent
        Laptop laptop3 = new Laptop("HP", "XPS 15", 2022, 1.8, 3, 8.0f);
        assertNotEquals(laptop, laptop3, "Laptopy z różnymi producentami nie powinny być równe.");

        // Test nierówności - inna waga
        Laptop laptop4 = new Laptop("Dell", "XPS 15", 2022, 1.9, 3, 8.0f);
        assertNotEquals(laptop, laptop4, "Laptopy z różną wagą nie powinny być równe.");
    }
}
package rekord;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    private Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8.0f);
    }

    @Test
    void testAccessors() {
        assertEquals("Dell", laptop.producent());
        assertEquals("XPS 15", laptop.model());
        assertEquals(2022, laptop.rokProdukcji());
        assertEquals(1.8, laptop.waga());
        assertEquals(3, laptop.iloscPortowUSB());
        assertEquals(8.0f, laptop.czasPracyNaBaterii());
    }

    @Test
    void testToString() {
        String expected = "Laptop[producent=Dell, model=XPS 15, rokProdukcji=2022, waga=1.8, iloscPortowUSB=3, czasPracyNaBaterii=8.0]";
        assertEquals(expected, laptop.toString());
    }

    @Test
    void testEqualsAndHashCode() {
        // Dwa identyczne obiekty powinny być równe i mieć ten sam hashCode
        Laptop laptop2 = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8.0f);
        assertEquals(laptop, laptop2);
        assertEquals(laptop.hashCode(), laptop2.hashCode());
    }

    @Test
    void testNotEquals() {
        // Dwa różne obiekty nie powinny być równe
        Laptop laptop2 = new Laptop("HP", "Spectre x360", 2023, 1.5, 2, 10.0f);
        assertNotEquals(laptop, laptop2);
    }
}
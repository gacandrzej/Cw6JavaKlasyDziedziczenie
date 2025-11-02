package komputery;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KomputerTest {

    private Komputer komputer;

    @BeforeEach
    void setUp() {
        komputer = new Komputer("Dell", "XPS 15", 2022);
    }

    @AfterEach
    void tearDown() {
        komputer = null;
    }

    @Test
    void getProducent() {
        assertEquals("Dell", komputer.getProducent());
    }

    @Test
    void setProducent() {
        komputer.setProducent("HP");
        assertEquals("HP", komputer.getProducent());
    }

    @Test
    void getModel() {
        assertEquals("XPS 15", komputer.getModel());
    }

    @Test
    void setModel() {
        komputer.setModel("Latitude");
        assertEquals("Latitude", komputer.getModel());
    }

    @Test
    void getRokProdukcji() {
        assertEquals(2022, komputer.getRokProdukcji());
    }

    @Test
    void setRokProdukcji() {
        komputer.setRokProdukcji(2023);
        assertEquals(2023, komputer.getRokProdukcji());
    }

    @Test
    void testToString() {
        assertEquals("Komputer{producent='Dell', model='XPS 15', rokProdukcji=2022}", komputer.toString());
    }

    @Test
    void włacz() {
        komputer.włacz();
    }

    @Test
    void wyłacz() {
        komputer.włacz(); // Ensure it's on before turning off

    }

    @Test
    void copy() {
        Komputer kopia = komputer.copy("Dell", "XPS 15", 2022);
        assertNotSame(komputer, kopia);
        assertEquals(komputer.getProducent(), kopia.getProducent());
        assertEquals(komputer.getModel(), kopia.getModel());
    }

    @Test
    void testEquals() {
        Komputer innyKomputer = new Komputer("Dell", "XPS 15", 2022);
        Komputer roznyKomputer = new Komputer("HP", "Spectre", 2023);

        assertTrue(komputer.equals(innyKomputer));
        assertFalse(komputer.equals(roznyKomputer));
        assertFalse(komputer.equals(null));
    }

    @Test
    void testHashCode() {
        // Test consistent hash code for equal objects
        Komputer innyKomputer = new Komputer("Dell", "XPS 15", 2022);
        Komputer roznyKomputer = new Komputer("HP", "Spectre", 2023);
        assertEquals(komputer.hashCode(), innyKomputer.hashCode());
        assertNotEquals(komputer.hashCode(), roznyKomputer.hashCode());
    }

    @Test
    void testCopyEquality() {
        Komputer kopia = komputer.copy("Dell", "XPS 15", 2022);
        assertEquals(komputer, kopia);
    }

    @Test
    void testCopyHashCode() {
        Komputer kopia = komputer.copy("Dell", "XPS 15", 2022);
        assertEquals(komputer.hashCode(), kopia.hashCode());
    }

    @Test
    void isWlaczony() {
        assertDoesNotThrow(() -> komputer.włacz());

    }

    @Test
    void testEquals_differentClass() {
        Object obj = new Object();
        assertFalse(komputer.equals(obj));
    }

    @Test
    void testEquals_sameInstance() {
        assertTrue(komputer.equals(komputer));
    }

    @Test
    void testEquals_differentProducent() {
        Komputer innyKomputer = new Komputer("HP", "XPS 15", 2022);
        assertFalse(komputer.equals(innyKomputer));
    }

}
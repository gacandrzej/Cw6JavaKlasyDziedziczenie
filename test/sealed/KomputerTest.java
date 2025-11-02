package sealed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KomputerTest {

    Komputer komputer;
    @BeforeEach
    void setUp() { // Initialize the 'komputer' field here
        komputer
                = new Komputer("Dell", "XPS", 2023);
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
    void testKomputer() {
        assertEquals("Dell", komputer.getProducent());
        assertEquals("XPS", komputer.getModel());
        assertEquals(2023, komputer.getRokProdukcji()); // Assuming rokProdukcji is part of Komputer
    }

    @Test
    void testToString() {
        String expected = "Komputer{producent='Dell', model='XPS', rokProdukcji=2023}";
        assertEquals(expected, komputer.toString());
    }



    @Test
    void testWlacz() {
        assertDoesNotThrow(() -> komputer.włacz());
        // Optionally, you could check for a side effect if 'wlacz' changed state
        // For example, if there was a 'isOn' boolean field.
    }














}
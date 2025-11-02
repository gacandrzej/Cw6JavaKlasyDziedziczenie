package rekord;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class KomputerTest {

    Komputer komputer;

    @BeforeEach
    void setUp() {
        komputer = new Komputer("Dell", "XPS", 2023);
    }

    @BeforeAll
    static void beforeAll() {

    }
//
    @AfterAll
    static void afterAll() {
    }

    @AfterEach
    void tearDown() {
        komputer = null;
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void wlacz() {
        komputer.wlacz();
    }

    @Test
    void testKomputer() {
        assertEquals("Dell", komputer.producent());
        assertEquals("XPS", komputer.model());
    }

    @Test
    void producent() {
        assertEquals("Dell", komputer.producent());
    }

    @Test
    void model() {
        assertEquals("XPS", komputer.model());
    }

    @Test
    void rokProdukcji() {
        assertEquals(2023, komputer.rokProdukcji());
    }
}
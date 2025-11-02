package komputery;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {
    Laptop laptop;
    @BeforeEach
    void setUp() {
        laptop = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8);
    }

    @AfterEach
    void tearDown() {
        laptop = null;
    }

    @Test
    void getProducent() {
        assertEquals("Dell", laptop.getProducent());
    }

    @Test
    void setProducent() {
        laptop.setProducent("HP");
        assertEquals("HP", laptop.getProducent());    }

    @Test
    void getModel() {
        assertEquals("XPS 15", laptop.getModel());
    }

    @Test
    void setModel() {
        laptop.setModel("Spectre x360");
        assertEquals("Spectre x360", laptop.getModel());
    }

    @Test
    void getRokProdukcji() {
        assertEquals(2022, laptop.getRokProdukcji());
    }

    @Test
    void setRokProdukcji() {
        laptop.setRokProdukcji(2023);
        assertEquals(2023, laptop.getRokProdukcji());
    }

    @Test
    void getWaga() {
        assertEquals(1.8, laptop.getWaga());
    }

    @Test
    void setWaga() {
        laptop.setWaga(1.9);
        assertEquals(1.9, laptop.getWaga());
    }

    @Test
    void getIloscPortowUSB() {
        assertEquals(3, laptop.getIloscPortowUSB());
    }

    @Test
    void setIloscPortowUSB() {
        laptop.setIloscPortowUSB(4);
        assertEquals(4, laptop.getIloscPortowUSB());
    }

    @Test
    void getCzasPracyNaBaterii() {
        assertEquals(8, laptop.getCzasPracyNaBaterii());
    }


    @Test
    void setCzasPracyNaBaterii() {
        laptop.setCzasPracyNaBaterii(10);
        assertEquals(10, laptop.getCzasPracyNaBaterii());
    }

    @Test
    void wyłącz() {
        laptop.włacz();
    }

    @Test
    void testEquals() {
        Laptop laptop2 = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8);
        assertEquals(laptop, laptop2);
    }

    @Test
    void testHashCode() {
        Laptop laptop2 = new Laptop("Dell", "XPS 15", 2022, 1.8, 3, 8);
        assertEquals(laptop.hashCode(), laptop2.hashCode());
    }

    @Test
    void testEqualsDifferentObject() {
        Laptop laptop2 = new Laptop("HP", "Spectre x360", 2023, 1.5, 2, 10);
        assertNotEquals(laptop, laptop2);
    }

    @Test
    void testEqualsDifferentClass() {
        Object obj = new Object();
        assertNotEquals(laptop, obj);
    }

    @Test
    void testEqualsNull() {
        assertNotEquals(laptop, null);
    }


    @Test
    void testEqualsSameObject() {
        assertEquals(laptop, laptop);
    }
    @Test
    void testEqualsDifferentProducer() {
        Laptop laptop2 = new Laptop("HP", "XPS 15", 2022, 1.8, 3, 8); // Changed producer
        assertNotEquals(laptop, laptop2);
    }

    @Test
    void testToString() {
        String expected = "Laptop{producent='Dell', model='XPS 15', rokProdukcji=2022, waga=1.8, iloscPortowUSB=3, czasPracyNaBaterii=8.0}";
        assertEquals(expected, laptop.toString());
    }

}
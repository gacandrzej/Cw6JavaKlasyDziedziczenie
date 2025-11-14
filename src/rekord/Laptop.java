package rekord;

/// Rekord reprezentujący laptopa.
/// Zastępuje klasę Laptop, dostarczając zwięzłą, niezmienną reprezentację danych.
public record Laptop(String producent, String model, int rokProdukcji, double waga,
                     int iloscPortowUSB, float czasPracyNaBaterii) implements Urzadzenie {
}
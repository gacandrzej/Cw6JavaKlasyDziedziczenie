package rekord;

/// Rekord reprezentujący smartfon.
/// Jest to niezmienny (immutable) nośnik danych, który automatycznie
/// dostarcza implementacje equals(), hashCode(), toString() oraz metody dostępowe.
/// Zastępuje klasę Smartfon, eliminując potrzebę ręcznego pisania tych metod.
public record Smartfon(String producent, String model, int rokProdukcji, String systemOperacyjny, int ilośćPamięci) implements Urzadzenie {
}
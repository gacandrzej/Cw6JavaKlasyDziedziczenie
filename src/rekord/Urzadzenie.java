package rekord;

// Sealed interface - kompilator wie jakie są wszystkie podtypy
public sealed interface Urzadzenie permits Komputer, Laptop, Smartfon {}
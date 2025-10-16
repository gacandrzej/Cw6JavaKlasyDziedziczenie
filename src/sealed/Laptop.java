package sealed;

public final class Laptop extends Komputer {
    private double waga;
    private int iloscPortowUSB;
    private float czasPracyNaBaterii; // w godzinach

    public Laptop() {
    }

    public Laptop(String producent, String model, int rokProdukcji, double waga, int iloscPortowUSB, float czasPracyNaBaterii) {
        super(producent, model, rokProdukcji);
        this.waga = waga;
        this.iloscPortowUSB = iloscPortowUSB;
        this.czasPracyNaBaterii = czasPracyNaBaterii;
    }

    // gettery/settery
    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public int getIloscPortowUSB() {
        return iloscPortowUSB;
    }

    public void setIloscPortowUSB(int iloscPortowUSB) {
        this.iloscPortowUSB = iloscPortowUSB;
    }

    public float getCzasPracyNaBaterii() {
        return czasPracyNaBaterii;
    }

    public void setCzasPracyNaBaterii(float czasPracyNaBaterii) {
        this.czasPracyNaBaterii = czasPracyNaBaterii;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "waga=" + waga +
                ", iloscPortowUSB=" + iloscPortowUSB +
                ", czasPracyNaBaterii=" + czasPracyNaBaterii +
                '}';
    }

    // Ctrl + O
    @Override
    public void włacz() {
       // super.włacz();
        IO.println("Laptop się uruchamia ...");
    }
}

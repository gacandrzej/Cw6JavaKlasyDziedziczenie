package komputery;

import java.util.Objects;

public class Smartfon extends Komputer{
    private String systemOperacyjny;
    private int ilośćPamięci;

    public Smartfon(String producent, String model, int rokProdukcji, String systemOperacyjny, int ilośćPamięci) {
        super(producent, model, rokProdukcji);
        this.systemOperacyjny = systemOperacyjny;
        this.ilośćPamięci = ilośćPamięci;
    }

    public String getSystemOperacyjny() {
        return systemOperacyjny;
    }

    public void setSystemOperacyjny(String systemOperacyjny) {
        this.systemOperacyjny = systemOperacyjny;
    }

    public int getIlośćPamięci() {
        return ilośćPamięci;
    }

    public void setIlośćPamięci(int ilośćPamięci) {
        this.ilośćPamięci = ilośćPamięci;
    }

    @Override
    public String toString() {
        return super.toString()+"Smartfon{" +
                "systemOperacyjny='" + systemOperacyjny + '\'' +
                ", ilośćPamięci=" + ilośćPamięci +
                '}';
    }

    @Override
    public void włacz() {
        IO.println("Smarttfon się uruchamia ..." + systemOperacyjny);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartfon smartfon = (Smartfon) o;
        return ilośćPamięci == smartfon.ilośćPamięci && Objects.equals(systemOperacyjny, smartfon.systemOperacyjny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), systemOperacyjny, ilośćPamięci);
    }
}

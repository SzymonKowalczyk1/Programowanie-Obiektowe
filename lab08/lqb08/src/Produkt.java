import java.time.LocalDate;

public class Produkt implements Comparable<Produkt> {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "dataWaznosci=" + dataWaznosci +
                '}';
    }

    @Override
    public int compareTo(Produkt o) {
        return (o.dataWaznosci.compareTo(this.dataWaznosci));
    }
}

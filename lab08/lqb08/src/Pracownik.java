import java.time.LocalDate;

public class Pracownik implements Comparable<Pracownik> {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(double pensja){
        this.pensja = pensja;
        this.dataZatrudnienia = LocalDate.ofEpochDay(2023-07-23);
        imie="default";
    }

    @Override
    public String toString() {
        return " " + pensja;
    }

    @Override
    public int compareTo(Pracownik o) {
        return (int) Math.signum(this.pensja-o.pensja);
    }
}

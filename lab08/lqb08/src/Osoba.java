public class Osoba implements Comparable <Osoba> {
    String imie;
    int wiek;
    double wzrost;

    public Osoba(String imie, int wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "wzrost=" + wzrost +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        return (int) Math.signum(o.wzrost-this.wzrost);
    }
}





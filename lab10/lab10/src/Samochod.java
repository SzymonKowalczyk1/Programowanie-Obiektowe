import java.sql.SQLOutput;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    void start(){
        silnik.uruchom();
    }
    void stop(){
        silnik.zatrzymaj();
    }
}

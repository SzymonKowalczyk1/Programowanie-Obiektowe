public class Licznik {
    public int liczba;

    public void zwieksz(int wartosc){
        liczba += wartosc;

    }
    public void dodaj(Licznik wartosc){
        liczba += wartosc.liczba;
    }

}

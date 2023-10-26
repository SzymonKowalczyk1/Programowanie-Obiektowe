public class Osoba {
    public String imie;

    public int wiek;

    public static int licznik;

    public Osoba(){


        this("default");

    }
    public Osoba(String imie){
        this.imie = imie;
        licznik+=1;
    }
}

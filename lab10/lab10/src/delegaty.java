public class delegaty {
    public static void main(String[] args) {
        KierwonikWycieczki kierownik = new KierwonikWycieczki(new Koncert());
        kierownik.zalatwBilet();
        kierownik = new KierwonikWycieczki(new Pociag());
        kierownik.zalatwBilet();
        kierownik = new KierwonikWycieczki(new Kino());
        kierownik.zalatwBilet();

        Biuro biuro = new Biuro(new StandardowyPirnter());
        biuro.drukujDokument("dokument");


        Samochod samochod = new Samochod(new BenzynowySilniik());
        samochod.start();
        samochod.stop();

        Uzytkownik uzytkownik = new Uzytkownik(new Email());
        uzytkownik.powiadomoModernizacji("Trwaja prace modernizacyjne");
    }
}

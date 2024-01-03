public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }
    void powiadomoModernizacji(String informacja){
        powiadomienie.wyslij(informacja);
    }
}

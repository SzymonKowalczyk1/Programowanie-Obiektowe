public class StandardowyPirnter implements Printer {
    @Override
    public void drukuj(String tekst) {
        System.out.println("Drukuje: "+tekst);
    }
}

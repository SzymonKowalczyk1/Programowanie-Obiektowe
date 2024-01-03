public class BenzynowySilniik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik uruchamia sie");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik zatrzymuje sie");
    }
}
